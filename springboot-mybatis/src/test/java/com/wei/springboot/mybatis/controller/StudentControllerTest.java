package com.wei.springboot.mybatis.controller;

import com.wei.springboot.mybatis.domain.entity.Student;
import com.wei.springboot.mybatis.service.IStudentService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {
    @Resource
    private IStudentService studentService;
    @Test
    public List<Student> getStudent() {
        List<Student> student = studentService.getStudent();
        return student;
    }

}