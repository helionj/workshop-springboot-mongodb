package com.helion.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.helion.workshopmongo.domain.Post;


public interface PostRepository extends MongoRepository<Post, String> {
	
	public List<Post> findByTitleContainingIgnoreCase(String text);

}
