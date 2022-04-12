package com.example.demo;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MethodAspect {

    @Pointcut("execution(* com.example.demo.service..*.*(..))")
    private void pointcut() {

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] param = joinPoint.getArgs();
        System.out.println(methodName);
        Arrays.stream(param).forEach((p) -> System.out.println(JSON.toJSONString(p)));
    }
}
