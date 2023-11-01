package com.dsdaaa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.Brand;
import com.dsdaaa.mapper.BrandMapper;
import com.dsdaaa.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dunston
 * @description 针对表【brand(分类品牌)】的数据库操作Service实现
 * @createDate 2023-10-30 21:20:47
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
        implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("is_deleted", 0);
        queryWrapper.orderByDesc("id");
        List<Brand> brandList = brandMapper.selectList(queryWrapper);
        return brandList;
    }
}




