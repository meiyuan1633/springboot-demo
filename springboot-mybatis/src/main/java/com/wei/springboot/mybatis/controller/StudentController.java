package com.wei.springboot.mybatis.controller;

import com.wei.springboot.mybatis.domain.entity.Student;
import com.wei.springboot.mybatis.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/StudentController")
@Slf4j
public class StudentController {
    @Resource
    IStudentService studentService;

    @RequestMapping("/getStudent")
    public List<Student> getStudent() {
        List<Student> student = studentService.getStudent();
        System.out.println(student);
       // log.info("student");
        return student;
    }
}
