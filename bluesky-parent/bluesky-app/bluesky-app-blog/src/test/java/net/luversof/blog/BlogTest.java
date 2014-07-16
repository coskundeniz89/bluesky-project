package net.luversof.blog;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import net.luversof.blog.domain.Blog;
import net.luversof.blog.service.BlogService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class BlogTest extends GeneralTest {
	
	@Autowired
	private BlogService blogService;

	@Test
	public void test() {
		List<Blog> blogList = blogService.findByUserId(22);
		log.debug("blogList : {}", blogList);
	}
}
