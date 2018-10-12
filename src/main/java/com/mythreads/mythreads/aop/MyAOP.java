/*
package com.mythreads.mythreads.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Stack;

import static org.slf4j.LoggerFactory.getLogger;

@Aspect
@Component
public class MyAOP {
  private static final Logger logger = getLogger(MyAOP.class);


  @Around()
  public Object getLog(ProceedingJoinPoint joinPoint){
    Stack
    logger.info("Logging::");
    return joinPoint.proceed();
  }

}
*/
