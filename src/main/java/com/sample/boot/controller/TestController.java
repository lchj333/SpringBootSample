package com.sample.boot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.boot.model.Product;
import com.sample.boot.service.TestService;

@RestController
public class TestController {
	@Autowired
	TestService service;
	
	@RequestMapping("/")
	public String testHome() {
		
		return "testHome";
	}
	
	@RequestMapping("/sin")
	public String single(@RequestParam int id) {
		System.out.println("id: " + id);
		Product p = service.testSingle(id);
		
		if(p != null) {
			return p.toString();
		}else {
			return "null";
		}
	}
	
	@RequestMapping("/mul")
	public String multi(@RequestParam(name = "ids") String str) {
		System.out.println("ids: " + str);
		String[] list = str.split(",");
		int[] ids = new int[list.length];
		for (int i = 0; i < ids.length; i++) {
			ids[i] = Integer.parseInt(list[i]);
		}
		
		ArrayList<Product> ps = service.testMulti(ids);
		if(!ps.isEmpty()) {
			return ps.toString();
		}else {
			return "null";
		}
	}
	
	@RequestMapping("/all")
	public String all() {
		ArrayList<Product> ps = service.getAllData();
		if(!ps.isEmpty()) {
			return ps.toString();
		}else {
			return "null";
		}
	}
	
	@RequestMapping("/ins")
	public String ins(@RequestParam(name = "name") String name, @RequestParam(name = "price") String price) {
		Product product = new Product(name, Integer.parseInt(price));
		
		int i = service.insertData(product);
		if(i != 0) {
			return "success!";
		}else {
			return "fail..";
		}
	}
	
	@RequestMapping("/handle")
	public String resultHandler() {
		String str = service.resultTest();
		if(!str.isEmpty()) {
			return str;
		}else {
			return "null";
		}
	}
}
