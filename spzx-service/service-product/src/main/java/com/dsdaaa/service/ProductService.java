package com.dsdaaa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.domain.Product;
import com.dsdaaa.vo.ProductItemVo;

/**
* @author dunston
* @description 针对表【product(商品)】的数据库操作Service
* @createDate 2023-10-30 11:39:36
*/
public interface ProductService extends IService<Product> {

    ProductItemVo item(Long skuId);
}
