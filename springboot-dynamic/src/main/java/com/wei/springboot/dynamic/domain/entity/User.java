package com.wei.springboot.dynamic.domain.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class User {
   @TableId(value = "u_id", type = IdType.AUTO)
    private Integer uId;

    @TableField(value = "u_name")
    private String uName;

    @TableField(value = "u_password")
    private String uPassword;

    @TableField(value = "u_phone")
    private String uPhone;

    @TableField(value = "u_hobby")
    private String uHobby;

    @TableField(value = "u_email")
    private String uEmail;

    @TableField(value = "u_intro")
    private String uIntro;

    @TableField(value = "is_delete")
    private Integer isDelete;

    @TableField(value = "u_request")
    private String uRequest;

    public static final String COL_U_ID = "u_id";

    public static final String COL_U_NAME = "u_name";

    public static final String COL_U_PASSWORD = "u_password";

    public static final String COL_U_PHONE = "u_phone";

    public static final String COL_U_HOBBY = "u_hobby";

    public static final String COL_U_EMAIL = "u_email";

    public static final String COL_U_INTRO = "u_intro";

    public static final String COL_IS_DELETE = "is_delete";

    public static final String COL_U_REQUEST = "u_request";
}