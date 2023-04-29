package com.fesa.pocbackendtcc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fesa.pocbackendtcc.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
