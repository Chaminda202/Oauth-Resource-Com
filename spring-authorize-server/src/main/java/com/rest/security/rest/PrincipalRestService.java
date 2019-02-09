package com.rest.security.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class PrincipalRestService {
	
	@RequestMapping(value="/user")
	public Principal getUser(Principal principal){
		return principal;
	}
}
