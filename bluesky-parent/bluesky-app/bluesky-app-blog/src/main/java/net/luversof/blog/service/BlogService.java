package net.luversof.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.luversof.blog.domain.Blog;
import net.luversof.blog.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	
	public Blog save(Blog blog) {
		return blogRepository.save(blog);
	}
	
	public Blog findOne(long blogId) {
		return blogRepository.findOne(blogId);
	}

	public Blog findByUser(long userId) {
		return blogRepository.findByUserId(userId);
	}
}
