//package org.springframework.controller;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Component
//public class WebConfig implements WebMvcConfigurer {
//
//	public WebConfig() {
//		System.out.println("拦截器被实例化");
//	}
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		System.out.println("拦截器生效");
//		registry.addInterceptor(new LogInterceptor()).addPathPatterns("/");
//	}
//}
//
//
