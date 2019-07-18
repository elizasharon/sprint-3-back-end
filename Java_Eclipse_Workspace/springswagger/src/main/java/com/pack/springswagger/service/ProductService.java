package com.pack.springswagger.service;

import java.util.List;

import com.pack.springswagger.model.Product;

public interface ProductService {

	public int saveProduct(Product product);
	public List<Product> listAllProducts();
	public Product findByIdProduct(int id);
	public int updateProduct(Product product);
	public int deleteProduct(int id);

}
