package com.dsdaaa.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.Product;
import com.dsdaaa.domain.ProductDetails;
import com.dsdaaa.domain.ProductSku;
import com.dsdaaa.mapper.ProductDetailsMapper;
import com.dsdaaa.mapper.ProductMapper;
import com.dsdaaa.mapper.ProductSkuMapper;
import com.dsdaaa.service.ProductService;
import com.dsdaaa.vo.ProductItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dunston
 * @description 针对表【product(商品)】的数据库操作Service实现
 * @createDate 2023-10-30 11:39:36
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
        implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailsMapper productDetailsMapper;

    @Autowired
    private ProductSkuMapper productSkuMapper;

    @Override
    public ProductItemVo item(Long skuId) {
        //当前sku信息
        ProductSku productSku = productSkuMapper.selectById(skuId);

        //当前商品信息
        Product product = productMapper.selectById(productSku.getProduct_id());

        //同一个商品下面的sku信息列表
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("product_id", productSku.getProduct_id());
        queryWrapper.eq("is_deleted", 0);
        List<ProductSku> productSkuList = productSkuMapper.selectList(queryWrapper);
        //建立sku规格与skuId对应关系
        Map<String, Object> skuSpecValueMap = new HashMap<>();
        productSkuList.forEach(item -> {
            skuSpecValueMap.put(item.getSku_spec(), item.getId());
        });

        //商品详情信息
        ProductDetails productDetails = productDetailsMapper.selectById(productSku.getProduct_id());

        ProductItemVo productItemVo = new ProductItemVo();
        productItemVo.setProductSku(productSku);
        productItemVo.setProduct(product);
        productItemVo.setDetailsImageUrlList(Arrays.asList(productDetails.getImage_urls().split(",")));
        productItemVo.setSliderUrlList(Arrays.asList(product.getSlider_urls().split(",")));
        productItemVo.setSpecValueList(JSON.parseArray(product.getSpec_value()));
        productItemVo.setSkuSpecValueMap(skuSpecValueMap);
        return productItemVo;
    }
}




