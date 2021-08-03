package com.ezen.boot.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.ezen.boot.model.Product;

@Mapper
public interface TestMapper {
	
	public Product getSingleDataById(int id);
	
	public ArrayList<Product> getMultiDataInId(int[] ids);
	
	public ArrayList<Product> getAllData();
	
	public int insertData(Product product);

}
