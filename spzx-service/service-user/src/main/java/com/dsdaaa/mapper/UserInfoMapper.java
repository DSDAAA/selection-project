package com.dsdaaa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsdaaa.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13180
* @description 针对表【user_info(会员表)】的数据库操作Mapper
* @createDate 2023-10-31 14:33:53
* @Entity generator.domain.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




