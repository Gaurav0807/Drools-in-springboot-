package com.example.demo.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;

@RestController
public class HomeController {
	
	@Autowired
	private KieSession session;
	
	@PostMapping("/order")
	public Order home(@RequestBody Order order)
	{
		session.insert(order);
		session.fireAllRules();
		return order;
		
	}

}
