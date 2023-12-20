package com.javatechie.restaurantservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.restaurantservice.RestaurantServiceApplication;
import com.javatechie.restaurantservice.dto.OrderResponseDTO;
import com.javatechie.restaurantservice.service.RestaurantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {

	private final RestaurantService service;
	
	@GetMapping
	public String greetingMessage() {
		return service.greeting();
	}
	
	@GetMapping
	public OrderResponseDTO getOrder(@PathVariable String orderId) {
		return service.getOrder(orderId);
	}
}
