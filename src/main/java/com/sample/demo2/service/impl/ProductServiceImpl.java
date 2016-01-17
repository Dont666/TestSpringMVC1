package com.sample.demo2.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sample.demo2.dao.ProductDAO;
import com.sample.demo2.models.Product;
import com.sample.demo2.service.ProductSerivce;

@Service
public class ProductServiceImpl implements ProductSerivce {
	
	@Resource(name="productDao")
	ProductDAO productDAO;

	@Override
	public Product getProductByName(String name) {
		Product p= productDAO.getProductByName(name);
		return p;
	}

}
