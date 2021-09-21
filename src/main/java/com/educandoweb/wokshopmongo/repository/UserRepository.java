package com.educandoweb.wokshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.wokshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
