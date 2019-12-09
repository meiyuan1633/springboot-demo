package com.wei.springboot.upload.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Component
public class FileUploadUtils {
    @Resource
    private FileInfoProperties properties;

    public String getImageRootPath(){
        /*
        * 获取图片路径+分割符+日期格式
        * /imgs/20191031/
        * */
        return properties.getImagePath()+ File.separator+ DateFormatUtils.format(new Date(),"yyyyMMdd");

    }

    /*
    * prefix    文件的前缀
    * oldFileName    旧文件的名字
    * 返回新文件的名字
    *
    * */
    public String getFileName(String prefix,String oldFileName){
        /*截取后缀名为 .png 或者 .jpg*/
        String suffixName = oldFileName.substring(oldFileName.indexOf("."));
        //获取图片名字格式为：IMG_2019103111.png
        return prefix+DateFormatUtils.format(new Date(),"yyyyMMddHHmmss")+suffixName;
    }

    /*保存路径*/
    public String saveImageFile(MultipartFile multipartFile)throws IOException{
        String imageRootPath = getImageRootPath();
        /*获取图片的名字*/
        String fileName = getFileName(properties.getPrefixImg(), multipartFile.getOriginalFilename());
        /*生成保存图片的数据库路径*/
        String imageFile = getImageRootPath() + File.separator + fileName;
        /*生成完成的保存图片的路径*/
        File file = new File(properties.getRootPath() + File.separator + imageFile);
        saveFile(multipartFile.getInputStream(),file);
        return imageFile;

    }

    private void saveFile(InputStream inputStream, File file) throws IOException {
        /*生成文件*/
        FileUtils.touch(file);
        /*保存到服务器*/
        FileUtils.copyInputStreamToFile(inputStream,file);
    }
}
