package com.sample.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sample.boot.interceptor.InterceptorSample;

@Configuration
public class WecMvcConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new InterceptorSample()).addPathPatterns("/*");
	}
}
