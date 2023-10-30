package com.dsdaaa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.domain.Category;

import java.util.List;

/**
 * @author 13180
 * @description 针对表【category(商品分类)】的数据库操作Service
 * @createDate 2023-10-30 11:41:12
 */
public interface CategoryService extends IService<Category> {

    List<Category> findOneCategory();

    List<Category> findCategoryTree();
}
