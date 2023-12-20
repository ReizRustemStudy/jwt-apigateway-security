package com.javatechie.swiggyapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.swiggyapp.dto.OrderResponseDTO;
import com.javatechie.swiggyapp.service.SwiggyAppService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/swiggy")
@RequiredArgsConstructor
public class SwiggyAppController {
	
	private final SwiggyAppService service;
	
	@GetMapping("/home")
	private String greetingMessage() {
		return service.greeting();
	}
	
	@GetMapping("/{orderId}")
	public OrderResponseDTO checkOrderStatus(@PathVariable String orderId) {
		return service.checkOrderStatus(orderId);
	}
}
