package com.wei.springboot.thymeleaf.controller;

import com.wei.springboot.thymeleaf.entity.ThymeBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/*前后端不分离*/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        /*后端传值到前端*/
        model.addAttribute("msg","hello");
        ThymeBean bean = new ThymeBean(0, "空空");
        model.addAttribute("bean", bean);

        model.addAttribute("id",1);

        model.addAttribute("page", 1);
        model.addAttribute("size", 10);


        model.addAttribute("image", "img/hello.png");

        //model.addAttribute("username","小明");
        List<String>list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add("test"+i);
        }
        model.addAttribute("list",list);
        return "index";
    }
}
