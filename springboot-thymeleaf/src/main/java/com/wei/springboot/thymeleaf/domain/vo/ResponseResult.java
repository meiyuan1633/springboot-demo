package com.wei.springboot.thymeleaf.domain.vo;

import lombok.Data;

@Data
public class ResponseResult<T> {

    private int status;
    private String msg;
    private T data;

    /**
     *
     * @param data
     * @return
     */
    public static ResponseResult success(Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setStatus(200);
        responseResult.setMsg("success");
        responseResult.setData(data);
        return responseResult;
    }

    public static ResponseResult success(int status, String msg, Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setStatus(status);
        responseResult.setMsg(msg);
        responseResult.setData(data);
        return responseResult;
    }



}
