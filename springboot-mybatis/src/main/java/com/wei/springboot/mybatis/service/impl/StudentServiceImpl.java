package com.wei.springboot.mybatis.service.impl;

import com.wei.springboot.mybatis.domain.entity.Student;
import com.wei.springboot.mybatis.mapper.IStudentMapper;
import com.wei.springboot.mybatis.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    IStudentMapper studentMapper;
    @Override
    public List<Student> getStudent() {
        List<Student> student = studentMapper.getStudent();
        return student;
    }
}
