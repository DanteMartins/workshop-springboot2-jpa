package com.dantemartins.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dantemartins.course.entities.Order;
import com.dantemartins.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(long Id){
		Optional<Order> obj = repository.findById(Id); 
		return obj.get();
	}	
}
