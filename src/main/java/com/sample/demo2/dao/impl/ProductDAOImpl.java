package com.sample.demo2.dao.impl;

import org.springframework.stereotype.Repository;

import com.sample.demo2.dao.ProductDAO;
import com.sample.demo2.models.Product;

@Repository("productDao")
public class ProductDAOImpl implements ProductDAO{

	@Override
	public Product getProductByName(String name) {
		Product p = new Product();
		p.setProductName(name);
		return p;
	}

}
