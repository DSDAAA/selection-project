package com.dsdaaa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.domain.Brand;

import java.util.List;

/**
* @author dunston
* @description 针对表【brand(分类品牌)】的数据库操作Service
* @createDate 2023-10-30 21:20:47
*/
public interface BrandService extends IService<Brand> {

    List<Brand> findAll();
}
