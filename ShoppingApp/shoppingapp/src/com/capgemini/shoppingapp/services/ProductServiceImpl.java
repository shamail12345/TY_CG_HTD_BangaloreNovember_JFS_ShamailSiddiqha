package com.capgemini.shoppingapp.services;


import java.util.List;

import com.capgemini.shoppingapp.beans.Product;
import com.capgemini.shoppingapp.dao.ProductDaoImpl;
import com.capgemini.shoppingapp.factory.ProductManager;

public class ProductServiceImpl implements ProductService {

	ProductDaoImpl dao = (ProductDaoImpl) ProductManager.getDao();
	@Override
	public List<Product> searchProduct(String productName) {
		// TODO Auto-generated method stub
		return dao.searchProduct(productName);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

	

}
