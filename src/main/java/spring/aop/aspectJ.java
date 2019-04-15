package main.java.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aspectJ {
	
	@Pointcut("within(main.java.spring.service.*)")
	private void dosome() {
		// TODO Auto-generated method stub

	}
	@Before("dosome()")
	private void brfore() {
		System.out.println("之前");

	}
	@After("dosome()")
	private void after() {
		System.out.println("之后");

	}
}
