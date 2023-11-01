package com.dsdaaa.service;

import com.dsdaaa.dto.OrderInfoDto;
import com.dsdaaa.vo.TradeVo;

public interface OrderInfoService {
    TradeVo getTrade();

    Long submitOrder(OrderInfoDto orderInfoDto);
}
