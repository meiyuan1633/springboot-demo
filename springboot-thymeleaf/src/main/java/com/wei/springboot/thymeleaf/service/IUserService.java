package com.wei.springboot.thymeleaf.service;

import org.apache.catalina.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers(int page, int size) throws Exception;
}
