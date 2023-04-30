package com.fesa.pocbackendtcc.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fesa.pocbackendtcc.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	
	Optional<User> findByEmailAndPassword(String email, String password);
}
