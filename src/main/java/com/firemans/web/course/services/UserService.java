package com.firemans.web.course.services;

import java.util.List; // Corrigido para java.util.List
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.firemans.web.course.repositories.UserRepository;
import com.firemans.web.course.entities.User; // Certifique-se de que a classe User está importada

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional <User> obj= repository.findById(id);
		return obj.get();
	}
}
