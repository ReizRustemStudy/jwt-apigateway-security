package com.javatechie.restaurantservice.service;

import org.springframework.stereotype.Service;

import com.javatechie.restaurantservice.dao.RestaurantOrderDAO;
import com.javatechie.restaurantservice.dto.OrderResponseDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantService {
	
	private final RestaurantOrderDAO orderDAO;
	
	public String greeting() {
		return "Welcome to Swiggy Restaurant service";
	}
	
	public OrderResponseDTO getOrder(String orderId) {
		return orderDAO.getOrders(orderId);
	}
}
