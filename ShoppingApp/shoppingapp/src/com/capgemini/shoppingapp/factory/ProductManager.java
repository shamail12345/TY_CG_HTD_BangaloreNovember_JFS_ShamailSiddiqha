package com.capgemini.shoppingapp.factory;

import com.capgemini.shoppingapp.beans.Product;
import com.capgemini.shoppingapp.dao.ProductDao;
import com.capgemini.shoppingapp.dao.ProductDaoImpl;
import com.capgemini.shoppingapp.services.ProductService;
import com.capgemini.shoppingapp.services.ProductServiceImpl;

public class ProductManager {
	
	private ProductManager() {
		
	}


	public static ProductService getServ1() {
		ProductServiceImpl serv =	new ProductServiceImpl();
		return  (ProductService) serv;
	}
	
	public static ProductDao getDao() {
		ProductDaoImpl dao = new ProductDaoImpl();
		return (ProductDao) dao;
	}
	
	public static Product getBean() {
		Product bean = new Product();
		return bean;
	}


	public static ProductService instanceOfContactServicesImpl() {
		ProductService service=new ProductServiceImpl();
		return service;
	}
}

	

