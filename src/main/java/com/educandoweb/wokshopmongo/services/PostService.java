package com.educandoweb.wokshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.wokshopmongo.domain.Post;
import com.educandoweb.wokshopmongo.repository.PostRepository;
import com.educandoweb.wokshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired	
	private PostRepository postRepository;;
	
	
	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));	
	}
	

	
}
