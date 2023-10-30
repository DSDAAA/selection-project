package com.dsdaaa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.Product;
import com.dsdaaa.mapper.ProductMapper;
import com.dsdaaa.service.ProductService;
import org.springframework.stereotype.Service;

/**
* @author 13180
* @description 针对表【product(商品)】的数据库操作Service实现
* @createDate 2023-10-30 11:39:36
*/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService {

}




