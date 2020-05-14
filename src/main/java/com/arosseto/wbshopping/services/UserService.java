package com.arosseto.wbshopping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arosseto.wbshopping.entities.User;
import com.arosseto.wbshopping.repositories.UserRepository;
import com.arosseto.wbshopping.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long idToFind, User userToBeUpdated) {
		User entity = repository.getOne(idToFind);
		updateData(entity, userToBeUpdated);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setName(obj.getEmail());
		entity.setName(obj.getPhone());
	}
}
