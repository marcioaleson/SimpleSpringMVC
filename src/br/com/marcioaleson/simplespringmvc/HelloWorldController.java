package br.com.marcioaleson.simplespringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloWorldSpring")
	public String execute() {
		System.out.println("Executing with Spring MVC");
		return "ok";
	}
}
