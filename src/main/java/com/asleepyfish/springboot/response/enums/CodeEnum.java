package com.asleepyfish.springboot.response.enums;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/16 14:09
 * @Description: TODO
 */
public enum CodeEnum {
    /**
     * 操作成功
     **/
    SUCCESS("0000", "操作成功"),
    /**
     * 操作失败
     **/
    ERROR("9999", "操作失败");

    /**
     * 自定义状态码
     **/
    private final String code;
    /**
     * 自定义描述
     **/
    private final String message;

    CodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
