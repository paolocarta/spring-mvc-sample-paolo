package me.paolocarta.samples.mvc.services;

import org.springframework.stereotype.Service;


@Service
public class HelloService {

	public String sayHello(){
		return "Hello User!";
	}
}
