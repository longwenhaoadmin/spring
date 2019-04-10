package main.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.spring.dao.impl.JdbcDAO;

public class HelloProgram {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		service.dosome();
		/*JdbcDAO dao = (JdbcDAO) context.getBean("dao");
		dao.queryAllTable();*/
		//hw.sayHello();
	}
}