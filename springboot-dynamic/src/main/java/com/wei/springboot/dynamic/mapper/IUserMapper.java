package com.wei.springboot.dynamic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.springboot.dynamic.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper extends BaseMapper<User> {
    /*从主数据库中查询所有用户信息*/
    List<User>selectAll();

    /*登录*/
    User login(@Param("u_name")String uName);

    /*注册*/
    User register(User user);

}