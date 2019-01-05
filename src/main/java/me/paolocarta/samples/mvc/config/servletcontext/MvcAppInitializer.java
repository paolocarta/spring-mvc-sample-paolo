package me.paolocarta.samples.mvc.config.servletcontext;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MvcAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class[] {RootAppContextConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {MvcContextConfig.class};
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] {"/"};
	}
}
