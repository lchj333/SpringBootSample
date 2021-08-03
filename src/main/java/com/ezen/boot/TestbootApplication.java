package com.ezen.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ezen.boot.mapper")
public class TestbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestbootApplication.class, args);
	}

}
