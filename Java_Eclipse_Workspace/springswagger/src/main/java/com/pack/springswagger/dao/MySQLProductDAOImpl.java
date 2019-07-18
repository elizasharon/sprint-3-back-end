package com.pack.springswagger.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.pack.springswagger.model.Product;

@Repository(value = "mysqlDaoImpl")
public class MySQLProductDAOImpl implements ProductDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int save(Product product) {

		System.out.println("Save Products in MySQL DAO");

		String query = "insert into products (name, price) values (?,?)";
		try {
			return jdbcTemplate.update(query, product.getName(), product.getPrice());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}


	public List<Product> listAll() {

		System.out.println("Liss All Products in MySQL DAO");

		String query = "select * from products";

		try {
			return jdbcTemplate.query(query, (rs, rowNum) -> new Product(rs.getInt(1), rs.getString(2),rs.getDouble(3)));
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public Product findById(int id) {
		
		System.out.println("Find By Id Employee in MySQL DAO");

		String query = "select * from products where id = " + id;

		try {
			return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new Product(rs.getInt(1), rs.getString(2),rs.getDouble(3)));
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public int delete(int id) {
		System.out.println("Delete Employee in MySQL DAO");

		String query = "delete from products where id = "+id;
		try {
			return jdbcTemplate.update(query);
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	public int update(Product product) {
		System.out.println("Update Product in MySQL DAO");

		String query = "update products set name = ? , price = ? where id = ? ";
		try {
			return jdbcTemplate.update(query, product.getName(), product.getPrice(), product.getId());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
