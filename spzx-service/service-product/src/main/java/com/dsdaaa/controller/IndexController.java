package com.dsdaaa.controller;

import com.dsdaaa.domain.Category;
import com.dsdaaa.domain.ProductSku;
import com.dsdaaa.service.CategoryService;
import com.dsdaaa.service.ProductSkuService;
import com.dsdaaa.vo.IndexVo;
import com.dsdaaa.vo.common.Result;
import com.dsdaaa.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "主页接口管理")
@RestController
@RequestMapping("/api/product/index")
public class IndexController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductSkuService productSkuService;

    @GetMapping
    @Operation(summary = "获取首页数据")
    public Result<IndexVo> findData() {
        List<Category> categoryList = categoryService.findOneCategory();
        List<ProductSku> productSkuList = productSkuService.findProductSkuBySale();
        IndexVo indexVo = new IndexVo();
        indexVo.setCategoryList(categoryList);
        indexVo.setProductSkuList(productSkuList);
        return Result.build(indexVo, ResultCodeEnum.SUCCESS);
    }
}
