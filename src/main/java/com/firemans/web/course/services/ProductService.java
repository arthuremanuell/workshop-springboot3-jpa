package com.firemans.web.course.services;

import java.util.List; // Corrigido para java.util.List
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.firemans.web.course.repositories.ProductRepository;
import com.firemans.web.course.entities.Product; // Certifique-se de que a classe Product está importada

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	public Product findById(Long id) {
		Optional <Product> obj= repository.findById(id);
		return obj.get();
	}
}
