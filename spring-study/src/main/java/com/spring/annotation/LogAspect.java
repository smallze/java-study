package com.spring.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut(value = "execution(* com.spring.service.UserService.*(..))")
    public void getPointCut() {

    }

    @Before(value = "getPointCut()")
    public void doBefore() {
        System.out.println("before...");
    }

    @After(value = "getPointCut()")
    public void doAfter(){
        System.out.println("after...");
    }

    @AfterThrowing(value = "getPointCut()")
    public void doAfterThrow(){
        System.out.println("doAfterThrow...");
    }

    @AfterReturning(value = "getPointCut()")
    public void AfterReturning(){
        System.out.println("AfterReturning...");
    }

    @Around(value = "getPointCut()")
    public void doAround(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before doAround...");
        point.proceed();
        System.out.println("after doAround...");
    }
}
