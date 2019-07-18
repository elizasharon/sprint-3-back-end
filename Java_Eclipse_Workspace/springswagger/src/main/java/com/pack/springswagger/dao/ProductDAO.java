package com.pack.springswagger.dao;

import java.util.List;

import com.pack.springswagger.model.Product;

public interface ProductDAO {

	public int save(Product product);
	public List<Product> listAll();
	public Product findById(int id);
	public int update( Product product);
	public int delete(int id);
	
}
