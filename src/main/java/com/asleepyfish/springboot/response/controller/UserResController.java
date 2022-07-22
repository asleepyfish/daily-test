package com.asleepyfish.springboot.response.controller;

import com.asleepyfish.springboot.response.BaseResponse;
import com.asleepyfish.springboot.response.pojo.BeanParam;
import com.asleepyfish.springboot.response.pojo.UserParam;
import com.asleepyfish.springboot.response.service.UserResService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/16 13:25
 * @Description: TODO
 */
@RestController
public class UserResController {
    @Resource
    private UserResService userResServiceImpl;

    /**
     * 使用Validated注解校验入参，当入参不符合标准时，result存储错误信息
     *
     * @param userParam
     * @param result
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(@Validated UserParam userParam, BindingResult result) {
        List<FieldError> fieldErrors = result.getFieldErrors();
        if (!fieldErrors.isEmpty()) {
            StringBuilder errors = new StringBuilder();
            fieldErrors.forEach(error -> {
                String defaultMessage = error.getDefaultMessage();
                errors.append(defaultMessage);
            });
            return errors.toString();
        }
        return "SUCCESS";
    }

    @RequestMapping("/hello1")
    public BaseResponse<String> getStr() {
        return BaseResponse.success("hello,捡田螺的小男孩");
    }


    @RequestMapping("/queryUser")
    public BaseResponse<UserParam> queryUser(String userId) {
        return BaseResponse.success(new UserParam("666", 123, "捡田螺的小男孩"));
    }

    @RequestMapping("/query")
    public BaseResponse<UserParam> testUserInfo(UserParam userParam) {
        UserParam param = userResServiceImpl.testUserInfo(userParam);
        return BaseResponse.success(param);
    }

    @PostMapping("/testBean")
    public BaseResponse<BeanParam<UserParam>> testBean(@RequestBody @Valid BeanParam<UserParam> beanParam) {
        return BaseResponse.success(beanParam);
    }

}
