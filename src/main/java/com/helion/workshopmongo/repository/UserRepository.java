package com.helion.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.helion.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String> {
	

}
