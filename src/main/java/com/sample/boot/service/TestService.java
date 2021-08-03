package com.sample.boot.service;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.boot.mapper.TestMapper;
import com.sample.boot.model.Product;

@Service
public class TestService {
	@Autowired
	private TestMapper mapper;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public Product testSingle(int id) {
		return mapper.getSingleDataById(id);
	}
	
	public ArrayList<Product> testMulti(int[] ids) {
		return mapper.getMultiDataInId(ids);
	}
	
	public ArrayList<Product> getAllData() {
		return mapper.getAllData();
	}
	
	public int insertData(Product product) {
		return mapper.insertData(product);
	}
	
	public String resultTest() {
		String mapper = "getAllData";
		StringBuilder sb = new StringBuilder();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.select(mapper, new ResultHandler<Product>() {
			@Override
			public void handleResult(ResultContext<? extends Product> resultContext) {
				Product product = resultContext.getResultObject();
				System.out.println(product.toString());
				
				sb.append(product.toString());
				sb.append("<br/>");
			}
		});
		
		System.out.println("\n" + sb.toString());
		return sb.toString().replaceAll("Product", "");
	}

}
