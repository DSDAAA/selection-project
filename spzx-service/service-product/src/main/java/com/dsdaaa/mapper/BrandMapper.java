package com.dsdaaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.Brand;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dunston
* @description 针对表【brand(分类品牌)】的数据库操作Mapper
* @createDate 2023-10-30 21:20:47
* @Entity generator.domain.Brand
*/
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {

}




