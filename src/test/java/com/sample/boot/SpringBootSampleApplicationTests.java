package com.sample.boot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootSampleApplicationTests {

	@BeforeEach
	public void before() {
		System.out.println("before");
	}
	
	@Test
	void contextLoads() {
		System.out.println("test");
	}

	@AfterEach
	public void after() {
		System.out.println("after");
	}
}
