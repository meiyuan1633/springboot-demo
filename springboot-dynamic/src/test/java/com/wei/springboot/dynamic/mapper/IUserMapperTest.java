package com.wei.springboot.dynamic.mapper;

import com.wei.springboot.dynamic.domain.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class IUserMapperTest {
    @Resource
    IUserMapper userMapper;

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectAll();
        /*遍历集合输出*/
        users.forEach(user -> log.info(users.toString()));
    }

    @Test
    public void login() {
        User login = userMapper.login("夏成");
        log.info("login:"+login);
    }

    @Test
    void register() {
    }
}