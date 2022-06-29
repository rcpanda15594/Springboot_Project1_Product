package com.test.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.model.Order;
import com.test.product.service.OrderService;

@RestController
public class ProductController {
	@Autowired
	private OrderService service;
	
	@GetMapping("/orders")
	public List<Order> getOrders(){
		return service.getAllOrders();
		
	}
	
	@GetMapping("/order/{orderid}")
	public Order employee(@PathVariable("orderid") Integer id) {

		return service.getOrder(id);

	}
	
	@PostMapping("/create")
	public Order addEmployee(@RequestBody Order order) {

		 service.addOrder(order);
		 return order;

	}
}
