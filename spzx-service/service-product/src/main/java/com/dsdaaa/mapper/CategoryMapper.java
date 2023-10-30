package com.dsdaaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 13180
 * @description 针对表【category(商品分类)】的数据库操作Mapper
 * @createDate 2023-10-30 11:41:12
 * @Entity generator.domain.Category
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




