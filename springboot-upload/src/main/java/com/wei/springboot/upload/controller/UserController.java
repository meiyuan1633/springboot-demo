package com.wei.springboot.upload.controller;

import com.wei.springboot.upload.service.IFileUploadService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/UserController")
/*解决跨域*/
/*@CrossOrigin(origins = "*")*/
public class UserController {
    @Resource
    IFileUploadService fileUploadService;

    public static final String UPLOAD_IMAGE_ROOT_PATH="D:\\Lesson\\class\\springboot-demo\\springboot-upload\\upload";

    /*
    * 分布式文件系统
    * 前端  post请求
    * multipartFile/from-data 支持文件上传
    * 1>文件覆盖的问题
    * 2>对图片进行重命名
    *
    * */
    @RequestMapping(value = "/upload",method = {RequestMethod.POST,RequestMethod.PUT})
    public String upload(@RequestParam("img") MultipartFile multipartFile, int uid) throws IOException {
        /*保存图片*/
        String image = fileUploadService.uploadImage(multipartFile);
        return image;
    }
}
