package com.dsdaaa.controller;

import com.dsdaaa.domain.Brand;
import com.dsdaaa.service.BrandService;
import com.dsdaaa.vo.common.Result;
import com.dsdaaa.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "品牌管理")
@RestController
@RequestMapping(value="/api/product/brand")
@SuppressWarnings({"unchecked", "rawtypes"})
public class BrandController {

   @Autowired
   private BrandService brandService;

   @Operation(summary = "获取全部品牌")
   @GetMapping("/findAll")
   public Result<List<Brand>> findAll() {
      List<Brand> list = brandService.findAll();
      return Result.build(list, ResultCodeEnum.SUCCESS);
   }

}
