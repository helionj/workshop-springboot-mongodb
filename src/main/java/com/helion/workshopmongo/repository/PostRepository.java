package com.helion.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.helion.workshopmongo.domain.Post;


public interface PostRepository extends MongoRepository<Post, String> {
	

}
