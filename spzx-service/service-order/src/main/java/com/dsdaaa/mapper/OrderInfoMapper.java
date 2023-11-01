package com.dsdaaa.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderInfoMapper {
    void save(OrderInfo orderInfo);
}
