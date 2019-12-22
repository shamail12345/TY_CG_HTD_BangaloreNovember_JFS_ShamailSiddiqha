package com.capgemini.shoppingapp.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable {
	
	private int productId;
	private String productName;
	private double productCost;
	private String productColor;
	private String description;
	private int noOfProducts;
	

}
