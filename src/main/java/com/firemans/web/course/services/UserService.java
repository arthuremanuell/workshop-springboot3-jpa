package com.firemans.web.course.services;

import java.util.List; // Corrigido para java.util.List
import java.util.Optional;
import com.firemans.web.course.resources.exceptions.ResourceExceptionHandler;
import com.firemans.web.course.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.firemans.web.course.repositories.UserRepository;
import com.firemans.web.course.entities.User; // Certifique-se de que a classe User está importada

@Service
public class UserService {

    private final ResourceExceptionHandler resourceExceptionHandler;
	@Autowired
	private UserRepository repository;

    UserService(ResourceExceptionHandler resourceExceptionHandler) {
        this.resourceExceptionHandler = resourceExceptionHandler;
    }

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);

	}

	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
