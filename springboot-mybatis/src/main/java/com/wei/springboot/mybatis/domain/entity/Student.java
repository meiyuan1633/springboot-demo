package com.wei.springboot.mybatis.domain.entity;


import lombok.Data;

@Data
public class Student {

    private Integer id;


    private String username;


    private String password;


    private Integer isDelete;

   /* public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_IS_DELETE = "is_delete";*/
}