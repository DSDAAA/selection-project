package com.dsdaaa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.domain.ProductSku;
import com.dsdaaa.dto.ProductSkuDto;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author dunston
 * @description 针对表【product_sku(商品sku)】的数据库操作Service
 * @createDate 2023-10-30 11:43:01
 */
public interface ProductSkuService extends IService<ProductSku> {

    List<ProductSku> findProductSkuBySale();

    ProductSku getBySkuId(Long skuId);

    PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto);
}
