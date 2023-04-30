package com.fesa.pocbackendtcc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fesa.pocbackendtcc.dto.UserDTO;
import com.fesa.pocbackendtcc.model.User;
import com.fesa.pocbackendtcc.repository.UserRepository;
import com.fesa.pocbackendtcc.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> userOptional = repo.findById(id);
		
		if(userOptional.isPresent()) {
			User user = userOptional.get();
			return user;
		} else {
			throw new ObjectNotFoundException("Objeto não encontrado.");
		}
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User update(User obj) {
		User newObj = repo.findById(obj.getId())
				.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado com o id: " + obj.getId()));
		updateData(newObj, obj);
		
		return repo.save(newObj);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setLast_name(obj.getLast_name());
		newObj.setEmail(obj.getEmail());
		newObj.setPassword(obj.getPassword());
	}

	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getLast_name(), objDTO.getEmail(), objDTO.getPassword());
	}
	
	
	public Optional<User> login(String email, String password) {
        return repo.findByEmailAndPassword(email, password);
    }
	
	
}
