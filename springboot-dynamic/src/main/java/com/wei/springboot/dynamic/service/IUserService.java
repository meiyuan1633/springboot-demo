package com.wei.springboot.dynamic.service;

import com.wei.springboot.dynamic.domain.entity.User;


import java.util.List;

public interface IUserService {

    /*从主数据库中查询所有用户信息*/
    List<User> selectAll();

    User login(String uName);

    User register(User user);
}
