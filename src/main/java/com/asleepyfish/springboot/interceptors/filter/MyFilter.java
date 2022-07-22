package com.asleepyfish.springboot.interceptors.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 17:13
 * @Description: TODO
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter 执行了。。。");
        // 放行请求
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
