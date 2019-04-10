package main.java.spring.service.impl;

import org.springframework.stereotype.Service;

import main.java.spring.service.HelloWorld;

@Service("StrutsHelloWorld")
public class StrutsHelloWorld implements HelloWorld {
	  
    @Override
	public void sayHello() {
        System.out.println("Struts Say Hello!!");
    }
  
}
