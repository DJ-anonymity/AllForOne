package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopController {
    @Before("execution(* com.service.UserService.*(..))")
    public void BeforeT(JoinPoint joinPoint) {
        for (Object s : joinPoint.getArgs()) {
            //打印所有参数，实际中就是记录日志了
            System.out.println("Before(executionafter advice : " + s);
        }
    }
}
