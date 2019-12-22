package com.capgemini.shoppingapp.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.shoppingapp.beans.Product;
import com.capgemini.shoppingapp.factory.ProductManager;
import com.capgemini.shoppingapp.services.ProductService;

public class ProductMain {
	
	public static void main(String[] args) {

		ProductService service=ProductManager.instanceOfContactServicesImpl();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 to show all Products");
			System.out.println("press 2 to search for Product");
			

			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			
				List<Product> list=service.getAllProduct();
				if(list!=null){
					for(Product cont:list){
						System.out.println(cont);
					}
				}
				break;
			case 2:
				System.out.println("Enter product Name To Search ");
				Operator.main(args);

				break;

				}
			}
		}
	}



