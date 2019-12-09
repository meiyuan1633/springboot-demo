package com.wei.springboot.thymeleaf.domain.entity;

import lombok.Data;

@Data

public class User {

    private Integer uId;


    private String uName;


    private String uPassword;


    private String uPhone;


    private String uHobby;


    private String uEmail;


    private String uIntro;


    private Integer isDelete;


    private String uRequest;

}