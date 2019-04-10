package main.java.spring.service.impl;

import org.springframework.stereotype.Service;

import main.java.spring.service.HelloWorld;

@Service("SpringHelloWorld")
public class SpringHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
		 System.out.println("Spring Say Hello!!");
	}

}
