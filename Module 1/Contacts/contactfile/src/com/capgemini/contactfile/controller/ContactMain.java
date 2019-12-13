package com.capgemini.contactfile.controller;

import java.util.Scanner;

import com.capgemini.contactfile.bean.ContactBean;
import com.capgemini.contactfile.dto.ContactDAO;
import com.capgemini.contactfile.util.ContactManger;

public class ContactMain {
	public static void main(String[] args) {

		ContactDAO dao = ContactManger.instanceOfContactDAOImlp();

		Scanner sc=new Scanner(System.in); 
		System.out.println("Press 1 to add contact");
		System.out.println("Press 2 to delete contact");
		System.out.println("Press 3 to edit contact");
		System.out.println("Press 4 to main menu");
		while(true)
		{
		
			ContactBean bean=new ContactBean();
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter contact name");
				String name=sc.next();
				System.out.println("Enter contact number");
				int number=sc.nextInt();	
				System.out.println("Enter the Group");
				String group=sc.next();

				bean.setName(name);
				bean.setNumber(number);
				bean.setGroup(group);

				boolean check=dao.insertContact(bean);
				if(check)
				{
					System.out.println("Contact added to the list");
				}
				else
				{
					System.out.println("Something went wrong");
				}			
				break;
				
			case 2:
				System.out.println("Enter contact name");
				String name1=sc.next();
				System.out.println("Enter contact number");
				int number1=sc.nextInt();	
				System.out.println("Enter the Group");
				String group1=sc.next();

				bean.setName(name1);
				bean.setNumber(number1);
				bean.setGroup(group1);


				boolean check1=dao.deleteContact(bean);
				if(check1)
				{
					System.out.println("Contact added to the list");
				}
				else
				{
					System.out.println("Something went wrong");
				}			
				break;
				
			case 3:
				System.out.println("Enter contact name");
				String name2=sc.next();
				System.out.println("Enter contact number");
				int number2=sc.nextInt();	
				System.out.println("Enter the Group");
				String group2=sc.next();

				bean.setName(name2);
				bean.setNumber(number2);
				bean.setGroup(group2);


				boolean check2=dao.updateContact(bean);
				if(check2)
				{
					System.out.println("Contact added to the list");
				}
				else
				{
					System.out.println("Something went wrong");
				}			
				break;
				
				
			case 4:
				MainMenu.main(args);
				break;
				
				
			}

		}

	}}


