package com.dsdaaa.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.ProductSku;
import com.dsdaaa.dto.ProductSkuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author dunston
* @description 针对表【product_sku(商品sku)】的数据库操作Mapper
* @createDate 2023-10-30 11:43:01
* @Entity generator.domain.ProductSku
*/
@Mapper
public interface ProductSkuMapper extends BaseMapper<ProductSku> {
    List<ProductSku> findProductSkuBySale();

    List<ProductSku> findByPage(ProductSkuDto productSkuDto);
}




