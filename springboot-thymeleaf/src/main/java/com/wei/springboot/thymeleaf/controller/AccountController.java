package com.wei.springboot.thymeleaf.controller;


import com.wei.springboot.thymeleaf.service.IUserService;
import org.apache.catalina.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
* 统一的结果集处理
* */
@RestController
@RequestMapping("/AccountController")
public class AccountController {
    @Resource
    IUserService userService;
    @RequestMapping("/list")
    public List<User> list(Model model, int page, int size) throws Exception {
        List<User> users = userService.getUsers(page, size);
        return users;
    }
}
