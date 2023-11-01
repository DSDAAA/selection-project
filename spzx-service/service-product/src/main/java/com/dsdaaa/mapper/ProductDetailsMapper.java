package com.dsdaaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.ProductDetails;
import org.apache.ibatis.annotations.Mapper;

/**
* @author dunston
* @description 针对表【product_details(商品sku属性表)】的数据库操作Mapper
* @createDate 2023-10-31 08:54:03
* @Entity generator.domain.ProductDetails
*/
@Mapper
public interface ProductDetailsMapper extends BaseMapper<ProductDetails> {

}




