package main.java.spring.service.impl;

import main.java.spring.service.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
		 System.out.println("Spring Say Hello!!");
	}

}
