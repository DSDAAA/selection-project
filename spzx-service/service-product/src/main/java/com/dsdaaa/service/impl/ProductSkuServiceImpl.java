package com.dsdaaa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.ProductSku;
import com.dsdaaa.dto.ProductSkuDto;
import com.dsdaaa.mapper.ProductSkuMapper;
import com.dsdaaa.service.ProductSkuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dunston
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

    @Override
    public ProductSku getBySkuId(Long skuId) {
        return productSkuMapper.selectById(skuId);
    }

    @Override
    public PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto) {
        PageHelper.startPage(page, limit);
        List<ProductSku> productSkuList = productSkuMapper.findByPage(productSkuDto);
        return new PageInfo<>(productSkuList);
    }
}




