package com.wei.springboot.upload.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IFileUploadService {

    /*
    * 抛出异常的原因是：有可能文件传不到后台
    * */
    String uploadImage(MultipartFile multipartFile) throws IOException;
}
