package main.java.spring.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class testController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "index";
	}
}
