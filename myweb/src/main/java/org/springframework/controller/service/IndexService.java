package org.springframework.controller.service;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class IndexService {

	@Resource
	private UserService userService;

	public IndexService() {
		System.out.println("Constructor from indexservice");
	}
}
