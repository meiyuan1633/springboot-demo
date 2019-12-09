package com.wei.springboot.dynamic.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.wei.springboot.dynamic.domain.entity.User;
import com.wei.springboot.dynamic.mapper.IUserMapper;
import com.wei.springboot.dynamic.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserMapper userMapper;

    /*
    * 从主数据库6310中查询所有
    * */
    @Override
    @DS("db6310")
    public List<User> selectAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    /*
    *从从数据库6311中查询用户名
    * */
    @Override
    @DS("db6310")
    public User login(String uName) {
        User user = userMapper.login(uName);
        return user;
    }

    /*
    * 往主数据库中写入数据 注册
    * */
    @Override
    @DS("db6311")
    public User register(User user) {
        User register = userMapper.register(user);
        return register;
    }
}
