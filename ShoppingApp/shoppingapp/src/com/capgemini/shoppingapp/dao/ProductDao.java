package com.capgemini.shoppingapp.dao;

import java.util.List;

import com.capgemini.shoppingapp.beans.Product;

public interface ProductDao {
	
	public List<Product> searchProduct(String name);
	public List<Product> getAllProduct();

}
