package me.paolocarta.samples.mvc.config.servletcontext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "me.paolocarta.samples.mvc.services")
public class RootAppContextConfig {

}
