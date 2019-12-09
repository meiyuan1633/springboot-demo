package com.wei.springboot.thymeleaf.controller;

import org.springframework.ui.Model;
import com.wei.springboot.thymeleaf.service.IUserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/*
 *全局统一的结果集处理
 * 全局异常的处理
 * docker 部署
 *
 * */
@Controller
@RequestMapping
public class UserController {
    @Resource
    IUserService userService;

    @RequestMapping("/list")
    public String list(Model model, int page, int size) {
        try {
            List<User> users = userService.getUsers(page, size);
            for (User u : users) {
                System.out.println(u.toString());
            }
            model.addAttribute("users", users);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/list";
    }

    @RequestMapping("/detail/{uId}")
    public String detail(@PathVariable int uId) {
        return "detail";
    }

}
