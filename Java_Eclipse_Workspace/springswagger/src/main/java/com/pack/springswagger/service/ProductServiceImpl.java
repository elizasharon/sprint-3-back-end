package com.pack.springswagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.springswagger.dao.ProductDAO;
import com.pack.springswagger.model.Product;

@Service(value = "employeeService")
public class ProductServiceImpl implements ProductService {

	 @Qualifier(value = "hibernateDAOImpl")
	private ProductDAO productDAO;

	public ProductServiceImpl(@Qualifier(value = "hibernateDAOImpl") ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Transactional
	public int saveProduct(Product product) {
		System.out.println("Save Product Service method");
		return productDAO.save(product);
	}

	@Transactional
	public List<Product> listAllProducts() {
		System.out.println("Save Product Service method");
		return productDAO.listAll();
	}

	@Transactional
	public Product findByIdProduct(int id) {
		System.out.println("Save Product Service method");
		return productDAO.findById(id);
	}

	@Transactional
	public int updateProduct(Product product) {
		System.out.println("Save Product Service method");
		return productDAO.update(product);
	}

	@Transactional
	public int deleteProduct(int id) {
		System.out.println("Save Product Service method");
		return productDAO.delete(id);
	}

}
