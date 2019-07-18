package com.pack.springswagger.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import com.pack.springswagger.model.Product;
import com.pack.springswagger.service.ProductService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.http.HttpStatus;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api/v1/products")
@PropertySource("classpath:documentation.properties")
public class ProductsController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })

	@ResponseStatus(HttpStatus.OK)
	public List<Product> listAllProducts() {
		System.out.println("List All products controller");
		return productService.listAllProducts();
	}

	@GetMapping(value = "/{id}", produces = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public Product findById(@ApiParam(value="${ProductController.FetchById}")  @PathVariable int id) {
		System.out.println("Find By id products controller");
		return productService.findByIdProduct(id);
	}

	@PostMapping(value = "/save", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public String saveProduct(@Valid @RequestBody Product product) {
		System.out.println("Save product controller");
		if (productService.saveProduct(product) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}

	@PutMapping(value = "/update/{id}", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE })
	public String updateProduct(@PathVariable int id, @RequestBody Product product) {
		System.out.println("Update Product method : " + id);
		product.setId(id);
		if (productService.updateProduct(product) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}

	@DeleteMapping(value = "/{id}")
	public String deleteProduct(@PathVariable int id) {
		System.out.println("Delete Product method");
		if (productService.deleteProduct(id) == 1) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}

}
