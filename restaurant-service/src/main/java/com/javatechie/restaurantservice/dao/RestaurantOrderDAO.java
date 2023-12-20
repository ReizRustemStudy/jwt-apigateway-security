package com.javatechie.restaurantservice.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.javatechie.restaurantservice.dto.OrderResponseDTO;

@Component
public class RestaurantOrderDAO {
	
	public OrderResponseDTO getOrders(String orderId) {
		return generateRandomOrders().get(orderId);
	}
	
	private Map<String, OrderResponseDTO> generateRandomOrders() {
		Map<String, OrderResponseDTO> orderMap = new HashMap<>();
		orderMap.put("35fds631", new OrderResponseDTO("35fds631", "VEG-MEALS", 1, 199, new Date(), "READY", 15));
		orderMap.put("9u71245h", new OrderResponseDTO("9u71245h1", "HYDERABADI DUM BIRYANI", 2, 641, new Date(), "PREPARING", 59));
		orderMap.put("37jbd832", new OrderResponseDTO("37jbd832\"", "PENEER BUTTER MASALA", 1, 325, new Date(), "DELIVERED", 0));
		return orderMap;		
	}
}
