package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AopServive;

@RestController
public class AopController {

	private AopServive aopServive;
	
	public AopController(AopServive aopServive) {
		this.aopServive = aopServive;
	}
	
	
	@GetMapping("/random")
	public String random() {
		return aopServive.getAccountBalance()+"";
	}
}
