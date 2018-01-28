package com.susl.Agroapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susl.Agroapi.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;

}
