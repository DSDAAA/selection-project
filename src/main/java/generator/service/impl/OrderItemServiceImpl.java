package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.OrderItem;
import generator.service.OrderItemService;
import generator.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author 13180
* @description 针对表【order_item(订单项信息)】的数据库操作Service实现
* @createDate 2023-11-01 14:34:37
*/
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem>
    implements OrderItemService{

}




