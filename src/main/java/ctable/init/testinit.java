package main.java.ctable.init;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Lazy(false)
public class testinit {
	
	@PostConstruct
	public void dosome(){
		System.out.println("启动初始化！");
	}
	
}
