package com.dsdaaa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.ProductSku;
import com.dsdaaa.mapper.ProductSkuMapper;
import com.dsdaaa.service.ProductSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 13180
 * @description 针对表【product_sku(商品sku)】的数据库操作Service实现
 * @createDate 2023-10-30 11:43:01
 */
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku>
        implements ProductSkuService {
    @Autowired
    private ProductSkuMapper productSkuMapper;

    /**
     * 获取畅销商品列表
     *
     * @return
     */
    @Override
    public List<ProductSku> findProductSkuBySale() {
        List<ProductSku> productSkuBySale = productSkuMapper.findProductSkuBySale();
        return productSkuBySale;
    }
}




