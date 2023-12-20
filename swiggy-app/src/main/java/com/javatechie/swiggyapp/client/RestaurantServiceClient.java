package com.javatechie.swiggyapp.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.javatechie.swiggyapp.dto.OrderResponseDTO;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RestaurantServiceClient {
	
	private final RestTemplate template;
	
	public OrderResponseDTO fetchOrderStatus(String orderId) {
		return template.getForObject("http://RESTAURANT-SERVICE/restaurant/order/status/" + orderId, OrderResponseDTO.class);
	}
}
