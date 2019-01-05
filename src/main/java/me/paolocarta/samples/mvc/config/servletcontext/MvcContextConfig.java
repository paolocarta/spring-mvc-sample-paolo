package me.paolocarta.samples.mvc.config.servletcontext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "me.paolocarta.samples.mvc.controllers")
public class MvcContextConfig {

}
