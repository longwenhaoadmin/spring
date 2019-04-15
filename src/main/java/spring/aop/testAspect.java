package main.java.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component("testAspect")
public class testAspect implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("aop前置");
		//org.springframework.aop.framework.ProxyFactoryBean
	}
	
}
