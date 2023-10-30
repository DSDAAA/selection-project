package com.dsdaaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.Product;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13180
* @description 针对表【product(商品)】的数据库操作Mapper
* @createDate 2023-10-30 11:39:36
* @Entity generator.domain.Product
*/
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}




