package com.dsdaaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.UserAddress;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13180
* @description 针对表【user_address(用户地址表)】的数据库操作Mapper
* @createDate 2023-11-01 11:30:05
* @Entity generator.domain.UserAddress
*/
@Mapper
public interface UserAddressMapper extends BaseMapper<UserAddress> {

}




