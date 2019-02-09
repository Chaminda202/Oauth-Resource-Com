package com.rest.security.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.security.model.Account;

@RestController
public class AccountRestService {

	private static final Map <Integer, Account> acclist = new HashMap<>();

	@RequestMapping(method=RequestMethod.GET, value="/account")
	private Collection<Account> getAllAccount(){
		if(CollectionUtils.isEmpty(acclist)){
			acclist.put(1234, new Account(new Long(1234), "Saman", "Single", "Matara"));
			acclist.put(1324, new Account(new Long(1324), "Kamal", "Join", "Colombo"));
			acclist.put(1432, new Account(new Long(1432), "Amal", "Vanitha", "Jafna"));
			acclist.put(2134, new Account(new Long(2134), "Arun", "Dole", "Negombo"));
		}
		return acclist.values();
	}
}
