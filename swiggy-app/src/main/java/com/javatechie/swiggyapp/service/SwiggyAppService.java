package com.javatechie.swiggyapp.service;

import org.springframework.stereotype.Service;

import com.javatechie.swiggyapp.client.RestaurantServiceClient;
import com.javatechie.swiggyapp.dto.OrderResponseDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SwiggyAppService {

	private final RestaurantServiceClient restaurantServiceClient;
	
	public String greeting() {
		return "Welcome to Swiggy App Service";
	}
	
	public OrderResponseDTO checkOrderStatus(String orderId) {
		return restaurantServiceClient.fetchOrderStatus(orderId);
	}
}
