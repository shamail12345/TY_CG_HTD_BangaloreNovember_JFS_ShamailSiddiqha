package com.capgemini.contactfile.controller;
import java.util.Scanner;
public class MainMenu {
	public static void main(String[] args) {


		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.LIST OF CONTACTS");
			System.out.println("2.SEARCH");
			System.out.println("3.PRODUCT");
			int option = sc.nextInt();
			switch(option)
			{
			case 1:
				ListMain.main(args);
				break;
			case 2:
				GetNameMain.main(args);
				break;
			case 3:
				ContactMain.main(args);
				break;
			default:System.out.println("invalid option....");
			break;


			}

		}
	}}

