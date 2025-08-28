package com.firemans.web.course.services;

import java.util.List; // Corrigido para java.util.List
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.firemans.web.course.repositories.CategoryRepository;
import com.firemans.web.course.entities.Category; // Certifique-se de que a classe Category está importada

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional <Category> obj= repository.findById(id);
		return obj.get();
	}
}
