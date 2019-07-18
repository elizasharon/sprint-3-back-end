package com.pack.springswagger.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.springswagger.model.Product;

@Repository("hibernateDAOImpl")
public class HibernateProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public int save(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		return 1;
	}


	@SuppressWarnings("unchecked")
	public List<Product> listAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.createQuery("from Product").list();
	}

	public Product findById(int id) {
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

	public int update(Product product) {
		System.out.println(product);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		return 1;
	}

	public int delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = session.byId(Product.class).load(id);
		session.delete(product);
		return 1;
	}

}
