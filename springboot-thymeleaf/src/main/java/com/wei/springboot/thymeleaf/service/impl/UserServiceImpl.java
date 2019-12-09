package com.wei.springboot.thymeleaf.service.impl;

import com.github.pagehelper.PageHelper;
import com.wei.springboot.thymeleaf.mapper.IUserMapper;
import com.wei.springboot.thymeleaf.service.IUserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Resource
     IUserMapper userMapper;
    @Override
    public List<User> getUsers(int page, int size) throws Exception {
        PageHelper.startPage(page, size);
        List<User> users = userMapper.selectList();
        return users;
    }
}
