package org.nti.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingProxy {
    private final Logger log = LoggerFactory.getLogger(LoggingProxy.class);
    @Before("org.nti.pointcuts.CommonPointcuts.servicePointcut()")
    public void before(JoinPoint joinPoint) {
        log.info("Before Proxy");
        log.info("{}", joinPoint.getSignature());
    }

    @AfterReturning("org.nti.pointcuts.CommonPointcuts.servicePointcut()")
    public void after(JoinPoint joinPoint) {
        log.info("AfterReturning Proxy");
        log.info("{}", joinPoint.getSignature());
    }

    @AfterThrowing("org.nti.pointcuts.CommonPointcuts.servicePointcut()")
    public void afterThrowing(JoinPoint joinPoint) {
        log.info("AfterThrowing Proxy");
        log.info("{}", joinPoint.getSignature());
    }

    @After("org.nti.pointcuts.CommonPointcuts.servicePointcut()")
    public void afterReturning(JoinPoint joinPoint) {
        log.info("After Proxy");
        log.info("{}", joinPoint.getSignature());
    }
}
