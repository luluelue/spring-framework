package org.springframework.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService {

	@Resource
	private IndexService indexService;

	public UserService() {
		System.out.println("Constructor from userservice");
	}
}
