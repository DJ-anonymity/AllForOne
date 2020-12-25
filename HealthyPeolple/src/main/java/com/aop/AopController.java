package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopController {
    //这个方法定义了切入点
    @Pointcut("@annotation(com.service.*)")
    public void pointCut()  {}

    //这个方法定义了具体的通知
    @After("pointCut()")
    public void recordRequestParam(JoinPoint joinPoint) {
        for (Object s : joinPoint.getArgs()) {
            //打印所有参数，实际中就是记录日志了
            System.out.println("after advice : " + s);
        }
    }

    //这个方法定义了具体的通知
    @Before("pointCut()")
    public void startRecord(JoinPoint joinPoint) {
        for (Object s : joinPoint.getArgs()) {
            //打印所有参数
            System.out.println("before advice : " + s);
        }
    }

    //这个方法定义了具体的通知
    @Around("pointCut()")
    public Object aroundRecord(ProceedingJoinPoint pjp) throws Throwable {
        for (Object s : pjp.getArgs()) {
            //打印所有参数
            System.out.println("around advice : " + s);
        }
        return pjp.proceed();
    }
}
