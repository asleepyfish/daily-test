package com.asleepyfish.springboot.interceptors;

import com.asleepyfish.springboot.interceptors.pojo.Person;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 15:27
 * @Description: TODO
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
     *
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        // 每一个项目对于登陆的实现逻辑都有所区别，我这里使用最简单的Session提取Person来验证登陆。
        HttpSession session = request.getSession();
        // 这里的Person是登陆时放入session的
        Person person = (Person) session.getAttribute("person");
        // 判断是否登录
        if (person == null) {
            response.sendRedirect(request.getContextPath() + "/person/error");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) {
    }
}
