package com.asleepyfish.design.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/13 16:01
 * @Description: TODO
 */
@Aspect
@Component
public class AnnotationPointcut {
    @Pointcut("execution(* com.asleepyfish.design.proxy.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("---------方法执行前---------");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("---------方法执行后---------");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:" + jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
        return proceed;
    }
}
