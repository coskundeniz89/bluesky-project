package net.luversof.blog;


import lombok.extern.slf4j.Slf4j;
import net.luversof.blog.domain.BlogPost;
import net.luversof.blog.domain.QBlogPost;
import net.luversof.blog.repository.BlogPostRepository;
import net.luversof.core.config.GeneralTest;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Slf4j
public class BlogTest extends GeneralTest {

	@Autowired
	private BlogPostRepository blogRepository;
	

	@Test
	@Ignore
	public void 셀렉트테스트() {
		BlogPost blog = blogRepository.findOne((long) 1);
		log.debug("result : {}", blog);
	}

	@Test
	@Ignore
	public void save테스트() {
		BlogPost blog = new BlogPost();
		blog.setMemberId(1);
		blog.setTitle("title");
		blog.setContent("content");

		BlogPost savedBlog = blogRepository.save(blog);
		log.debug("savedBlog : {}", savedBlog);
	}

	@Test
//	@Ignore
	public void selectPaging테스트() {
		Pageable pageable = new PageRequest(0, 20);
		Page<BlogPost> blogPage = blogRepository.findAll(pageable);
		log.debug("blogPage : {}", blogPage);
		log.debug("blogPage : {}", blogPage.getContent());
	}
	
	@Test
	@Ignore
	public void 테스트() {
		QBlogPost blogPost = QBlogPost.blogPost;
		Iterable<BlogPost> list = blogRepository.findAll(blogPost.content.startsWith("c"));
		log.debug("list : {}", list);
	}
}
