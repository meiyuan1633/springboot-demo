package com.wei.springboot.mybatis.mapper;


import com.wei.springboot.mybatis.domain.entity.Student;

import java.util.List;

public interface IStudentMapper {

    /*查询所有*/
    List<Student> getStudent();
}