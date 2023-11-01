package com.dsdaaa.service.impl;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.Category;
import com.dsdaaa.mapper.CategoryMapper;
import com.dsdaaa.service.CategoryService;
import com.github.xiaoymin.knife4j.core.util.CollectionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author dunston
 * @description 针对表【category(商品分类)】的数据库操作Service实现
 * @createDate 2023-10-30 11:41:12
 */
@Service
@Slf4j
@Cacheable(value = "category", key = "'all'")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
        implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 获取商品
     *
     * @return
     */
    @Override
    public List<Category> findOneCategory() {
        String categoryListJSON = redisTemplate.opsForValue().get("category:one");
        if (!StringUtils.isEmpty(categoryListJSON)) {
            List<Category> categoryList = JSON.parseArray(categoryListJSON, Category.class);
            log.info("从Redis缓存中查询到了所有的一级分类数据");
            return categoryList;
        }
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("parent_id", 0);
        queryWrapper.eq("status", 1);
        queryWrapper.eq("is_deleted", 0);
        queryWrapper.orderByDesc("order_num");
        List<Category> categoryList = categoryMapper.selectList(queryWrapper);
        log.info("从数据库中查询到了所有的一级分类数据");
        redisTemplate.opsForValue().set("category:one", JSON.toJSONString(categoryList), 7, TimeUnit.DAYS);
        return categoryList;
    }

    @Override
    public List<Category> findCategoryTree() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("is_deleted", 0);
        queryWrapper.eq("status", 1);
        queryWrapper.orderByAsc("order_num");
        List<Category> categoryList = categoryMapper.selectList(queryWrapper);
        //全部一级分类
        List<Category> oneCategoryList = categoryList.stream().filter(item -> item.getParent_id().longValue() == 0).collect(Collectors.toList());

        if (!CollectionUtils.isEmpty(oneCategoryList)) {
            oneCategoryList.forEach(oneCategory -> {
                List<Category> twoCategoryList = categoryList.stream().filter(item -> item.getParent_id().longValue() == oneCategory.getId().longValue()).collect(Collectors.toList());
                oneCategory.setChildren(twoCategoryList);

                if (!CollectionUtils.isEmpty(twoCategoryList)) {
                    twoCategoryList.forEach(twoCategory -> {
                        List<Category> threeCategoryList = categoryList.stream().filter(item -> item.getParent_id().longValue() == twoCategory.getId().longValue()).collect(Collectors.toList());
                        twoCategory.setChildren(threeCategoryList);
                    });
                }
            });
        }
        return oneCategoryList;
    }
}




