package com.dsdaaa.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.domain.Brand;
import com.dsdaaa.mapper.BrandMapper;
import com.dsdaaa.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 13180
* @description 针对表【brand(分类品牌)】的数据库操作Service实现
* @createDate 2023-10-30 21:20:47
*/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
    implements BrandService {

    @Override
    public List<Brand> findAll() {
        return null;
    }
}




