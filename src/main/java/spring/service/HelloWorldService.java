package main.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import main.java.spring.dao.impl.JdbcDAO;
import main.java.spring.service.impl.StrutsHelloWorld;

public class HelloWorldService {
	
	
	@Autowired
	@Qualifier("springHelloWorld")
	private HelloWorld helloWorld;
	
	@Autowired
	private JdbcDAO dao;
	
	
	public HelloWorldService(StrutsHelloWorld helloWorld) {
		System.out.println("autowiring by constructor");
		this.helloWorld = helloWorld;
	}
	
	public HelloWorldService() {

	}
	public void dosome() {
		helloWorld.sayHello();
		dao.queryAllTable();
	}
}
