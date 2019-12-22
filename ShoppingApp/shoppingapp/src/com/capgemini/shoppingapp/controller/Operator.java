package com.capgemini.shoppingapp.controller;

import java.util.Scanner;

public class Operator {
	
	
		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.println("press 1 to Buy");
				System.out.println("press 2 search");
				System.out.println("press 3 to go back to main menu");
				int ch=sc.nextInt();
				switch(ch){
				case 1:
					System.out.println("Enter card number");
					String msg=sc.next();
					System.out.println("Product purchased...");

					break;
				case 2:
					Operator.main(args);

					break;
				case 3:
					ProductMain.main(args);
					break;
				}
			}
		}
	}


