package org.springframework.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.controller.service.UserService;

public class SpringInit {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = ac.getBean(UserService.class);

	}
}
