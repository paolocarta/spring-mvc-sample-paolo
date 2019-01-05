package me.paolocarta.samples.mvc.controllers;

import me.paolocarta.samples.mvc.services.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class HelloController {

	@Resource
	private HelloService helloService;

	@GetMapping
	public String hello() {
		return "Hello!";
	}

	@GetMapping(path = "/service")
	public String helloFromService(){
		return helloService.sayHello();
	}
}
