package com.psebastian21.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpls implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello world!!";
	}

}
