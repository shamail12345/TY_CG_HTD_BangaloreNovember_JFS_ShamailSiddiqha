package com.capgemini.contactfile.dto;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;

public interface ContactDAO {

	public List<ContactBean>getAllContacts();
	public boolean insertContact(ContactBean user);
	public boolean deleteContact(ContactBean bean);
	public boolean updateContact(ContactBean bean);
	
	
}
