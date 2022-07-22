package com.asleepyfish.springboot.response.exception;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/16 14:22
 * @Description: TODO
 */
public class BizException extends RuntimeException {
    private String retCode;

    private String retMessage;

    public BizException() {
        super();
    }

    public BizException(String retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public String getRetCode() {
        return retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }
}
