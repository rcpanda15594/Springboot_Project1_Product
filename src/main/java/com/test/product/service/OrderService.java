package com.test.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.product.model.Order;
import com.test.product.repository.OrderRepository;

@Service
public class OrderService {

	private OrderRepository repository;
	
	public List<Order> getAllOrders() {
		
		return repository.findAll();
	}

	public Order getOrder(Integer id) {
		
		return repository.findById(id).get();
	}

	public void addOrder(Order order) {
		repository.save(order);
		
	}

}
