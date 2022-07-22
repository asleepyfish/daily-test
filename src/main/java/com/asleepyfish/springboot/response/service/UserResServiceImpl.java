package com.asleepyfish.springboot.response.service;

import com.asleepyfish.springboot.response.exception.BizException;
import com.asleepyfish.springboot.response.pojo.UserParam;
import org.springframework.stereotype.Service;

/**
 * @Author: zhoujh42045
 * @Date: 2022/6/16 14:27
 * @Description: TODO
 */
@Service
public class UserResServiceImpl implements UserResService {
    @Override
    public UserParam testUserInfo(UserParam userParam) throws BizException {
        throw new BizException("6666", "测试异常类");
    }
}
