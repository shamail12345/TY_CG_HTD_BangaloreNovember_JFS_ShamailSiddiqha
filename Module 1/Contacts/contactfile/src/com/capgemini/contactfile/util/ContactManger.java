package com.capgemini.contactfile.util;

import com.capgemini.contactfile.dto.ContactDAO;
import com.capgemini.contactfile.dto.ContactDAOImpl;

public class ContactManger {
	private ContactManger() {
	}
	
	
	
	public static ContactDAO instanceOfContactDAOImlp() {
		ContactDAO dao= new ContactDAOImpl();
		return dao;
	}

}
