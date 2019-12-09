package com.wei.springboot.dynamic.controller;

import com.wei.springboot.dynamic.domain.entity.User;

import com.wei.springboot.dynamic.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//@Slf4j
@RestController
@RequestMapping("/UserController")
public class UserController {
   @Resource
    private IUserService userService;

    /*从主数据库中查询所有用户信息*/
    @RequestMapping("selectAll")
    public List<User> selectAll(){
        List<User> users = userService.selectAll();

        return users;
    }

    /*登录*/
    @RequestMapping("/login")
    public User login(String uName){
        User login = userService.login(uName);
        return login;
    }

    /*注册*/
    @RequestMapping("/register")
    public User register(User user){
        User register = userService.register(user);

        return register;
    }
}
