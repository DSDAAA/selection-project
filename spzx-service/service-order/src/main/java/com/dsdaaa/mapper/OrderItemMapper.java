package com.dsdaaa.mapper;

import com.dsdaaa.domain.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper {
    void save(OrderItem orderItem);
}
