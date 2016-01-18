package com.sample.demo2.dao.impl;


import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sample.demo2.dao.ProductDAO;
import com.sample.demo2.models.Product;


@Repository("productDao")
public class ProductDAOImpl implements ProductDAO{
	
	@Resource(name="hibernateTemplate")
	HibernateTemplate template;

	@Override
	public Product getProductByName(String name) {
		Product p = new Product();
		String queryString = "from product where productname=?";
		 template.find(queryString, name);
		p.setProductName(name);
		return p;
	}

	@Override
	public void deleteProductById(long id) {
		
	}

}
