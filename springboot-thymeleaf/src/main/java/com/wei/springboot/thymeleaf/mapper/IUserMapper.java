package com.wei.springboot.thymeleaf.mapper;

import org.apache.catalina.User;

import java.util.List;

public interface IUserMapper {

    List<User> selectList();
}
