package main.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import main.java.spring.dao.impl.JdbcDAO;
import main.java.spring.service.impl.SpringHelloWorld;
import main.java.spring.service.impl.StrutsHelloWorld;

@Service("helloWorldService")
public class HelloWorldService {
	
	
	@Autowired
	//@Qualifier("springHelloWorld")
	private SpringHelloWorld helloWorld;
	
	@Autowired
	private JdbcDAO dao;
	
	
	
	public HelloWorldService() {

	}
	public void dosome() {
		helloWorld.sayHello();
		dao.queryAllTable();
	}
}
