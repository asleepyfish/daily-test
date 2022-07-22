package com.asleepyfish.springboot.response.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/16 13:21
 * @Description: TODO
 */
@Data
@AllArgsConstructor
public class UserParam {
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @NotNull(message = "手机号不能为空")
    @Max(value = 100)
    private Integer phone;

    @NotBlank(message = "邮箱不能为空")
    private String email;
}
