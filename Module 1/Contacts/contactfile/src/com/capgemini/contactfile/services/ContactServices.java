package com.capgemini.contactfile.services;

import java.util.List;

import com.capgemini.contactfile.bean.ContactBean;

public interface ContactServices {
	public List<ContactBean>getAllContacts();
	public boolean insertContact(ContactBean user);
	public boolean updateContact(ContactBean user);
	public boolean deleteContact(ContactBean user);

}
