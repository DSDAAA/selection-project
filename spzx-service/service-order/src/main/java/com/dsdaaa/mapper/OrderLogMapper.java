package com.dsdaaa.mapper;

import com.dsdaaa.domain.OrderLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderLogMapper {
    void save(OrderLog orderLog);
}
