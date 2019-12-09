package com.wei.springboot.upload.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("fileupload")
@Data
public class FileInfoProperties {

    private String rootPath;
    private String imagePath;
    private String pdfPath;
    private String prefixImg;

}
