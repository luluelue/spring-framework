package org.springframework.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	public UserService() {
		System.out.println("Constructor from userservice");
	}
}
