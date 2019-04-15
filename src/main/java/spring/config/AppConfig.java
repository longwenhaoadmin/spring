package main.java.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.spring.service.HelloWorld;
import main.java.spring.service.impl.SpringHelloWorld;

@Configuration
public class AppConfig {
	
	@Bean("hld")
	 public HelloWorld helloWorld() {
	        return new SpringHelloWorld();
	    }
}
