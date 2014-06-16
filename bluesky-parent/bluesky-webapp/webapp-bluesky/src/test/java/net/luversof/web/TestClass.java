package net.luversof.web;

import lombok.extern.slf4j.Slf4j;
import net.luversof.data.jpa.JpaConfig;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@Slf4j
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={JpaConfig.class})
public class TestClass {
	
	@Autowired
	private ApplicationContext ctx;

	@Test
	@Ignore
	public void test(){
		log.debug("ctx : {}", ctx);
	}
}