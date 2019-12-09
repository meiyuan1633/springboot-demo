package com.wei.springboot.mybatis.service;

import com.wei.springboot.mybatis.domain.entity.Student;

import java.util.List;

public interface IStudentService {
    /*查询所有*/
    List<Student>getStudent();
}
