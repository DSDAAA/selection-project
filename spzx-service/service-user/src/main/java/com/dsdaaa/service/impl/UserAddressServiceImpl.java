package com.dsdaaa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsdaaa.config.AuthContextUtil;
import com.dsdaaa.domain.UserAddress;
import com.dsdaaa.mapper.UserAddressMapper;
import com.dsdaaa.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 13180
 * @description 针对表【user_address(用户地址表)】的数据库操作Service实现
 * @createDate 2023-11-01 11:30:05
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress>
        implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> findUserAddressList() {
        Long userId = AuthContextUtil.getUserInfo().getId();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", userId);
        queryWrapper.eq("is_deleted", 0);
        return userAddressMapper.selectList(queryWrapper);
    }

    @Override
    public UserAddress getById(Long id) {
        return userAddressMapper.selectById(id);
    }
}




