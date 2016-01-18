package com.sample.demo2.dao;

import com.sample.demo2.models.Product;

public interface ProductDAO {
	public Product getProductByName(String name);
	public void deleteProductById(long id);
}
