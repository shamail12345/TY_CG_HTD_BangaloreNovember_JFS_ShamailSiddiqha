package com.capgemini.contactfile.services;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;
import com.capgemini.contactfile.dto.ContactDAO;
import com.capgemini.contactfile.util.ContactManger;

public class ContactServicesImpl implements ContactServices{
	
	ContactDAO dao = ContactManger.instanceOfContactDAOImlp();

	@Override
	public List<ContactBean> getAllContacts() {
		return dao.getAllContacts();
	}

	@Override
	public boolean insertContact(ContactBean user) {
		return dao.insertContact(user);
	}

	@Override
	public boolean updateContact(ContactBean user) {
		// TODO Auto-generated method stub
		return dao.updateContact(user);
	}

	@Override
	public boolean deleteContact(ContactBean user) {
		return false;
	}

}
