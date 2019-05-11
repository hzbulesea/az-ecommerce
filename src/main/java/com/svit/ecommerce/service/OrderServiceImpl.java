package com.svit.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svit.ecommerce.model.Order;
import com.svit.ecommerce.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	private OrderRepository orderRepository;
	public OrderServiceImpl(OrderRepository orderRepository) {
			this.orderRepository = orderRepository;
	}
	
	@Override
	public Order create(Order order){
		return this.orderRepository.save(order);
	}
	
	@Override
	public void update(Order order) {
		
	}
	
	@Override
	public Iterable<Order> getAllOrders(){
		return orderRepository.findAll();
		
	}
}
