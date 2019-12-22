package com.capgemini.shoppingapp.services;

import java.util.List;

import com.capgemini.shoppingapp.beans.Product;

public interface ProductService {
	public List<Product> searchProduct(String name);
	public List<Product> getAllProduct();
	

}
