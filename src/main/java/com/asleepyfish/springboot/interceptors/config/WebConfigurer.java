package com.asleepyfish.springboot.interceptors.config;

import com.asleepyfish.springboot.interceptors.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 15:28
 * @Description: 拦截器配置类
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Resource
    private LoginInterceptor loginInterceptor;

    /**
     * 这个方法是用来配置静态资源的，比如html，js，css，等等
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    }

    /**
     * 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns拦截的路径
        String[] addPathPatterns = {
                "/person/**"
        };
        // excludePathPatterns排除的路径
        String[] excludePathPatterns = {
                "/person/login", "/person/noLogin", "/person/error"
        };
        // 创建用户拦截器对象并指定其拦截的路径和排除的路径
        registry.addInterceptor(loginInterceptor).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
