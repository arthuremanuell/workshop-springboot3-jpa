package com.firemans.web.course.services;

import java.util.List; // Corrigido para java.util.List
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.firemans.web.course.repositories.OrderRepository;
import com.firemans.web.course.entities.Order; 

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional <Order> obj= repository.findById(id);
		return obj.get();
	}
}
