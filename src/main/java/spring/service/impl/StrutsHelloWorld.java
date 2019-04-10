package main.java.spring.service.impl;

import main.java.spring.service.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {
	  
    @Override
	public void sayHello() {
        System.out.println("Struts Say Hello!!");
    }
  
}
