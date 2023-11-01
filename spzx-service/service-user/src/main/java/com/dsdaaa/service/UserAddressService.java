package com.dsdaaa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.domain.UserAddress;

import java.util.List;

/**
 * @author 13180
 * @description 针对表【user_address(用户地址表)】的数据库操作Service
 * @createDate 2023-11-01 11:30:05
 */
public interface UserAddressService extends IService<UserAddress> {
    List<UserAddress> findUserAddressList();

    UserAddress getById(Long id);
}
