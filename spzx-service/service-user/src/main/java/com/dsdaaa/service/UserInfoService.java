package com.dsdaaa.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.dsdaaa.domain.UserInfo;
import com.dsdaaa.dto.UserLoginDto;
import com.dsdaaa.dto.UserRegisterDto;
import com.dsdaaa.vo.UserInfoVo;

/**
 * @author 13180
 * @description 针对表【user_info(会员表)】的数据库操作Service
 * @createDate 2023-10-31 14:33:53
 */
public interface UserInfoService extends IService<UserInfo> {

    void register(UserRegisterDto userRegisterDto);

    String login(UserLoginDto userLoginDto, String ip);

    UserInfoVo getCurrentUserInfo(String token);
}
