package com.wei.springboot.upload.service.impl;
import com.wei.springboot.upload.utils.FileUploadUtils;
import com.wei.springboot.upload.service.IFileUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class FileUploadServiceImpl implements IFileUploadService {

    @Resource
    FileUploadUtils fileUploadUtils;

    @Override
    public String uploadImage(MultipartFile multipartFile) throws IOException {
        String imageFile = fileUploadUtils.saveImageFile(multipartFile);

        return imageFile;
    }
}
