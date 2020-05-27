package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AopServive {

	public   double  getAccountBalance() {
		return Math.random();
	}
	
	
	public String  getName() {
		return "My Name";
	}
}

