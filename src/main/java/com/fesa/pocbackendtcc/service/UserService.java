package com.fesa.pocbackendtcc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fesa.pocbackendtcc.dto.UserDTO;
import com.fesa.pocbackendtcc.model.User;
import com.fesa.pocbackendtcc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User insert(User obj) {
		return repo.insert(obj);
	}

	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getLast_name(), objDTO.getEmail(), objDTO.getPassword());
	}
}
