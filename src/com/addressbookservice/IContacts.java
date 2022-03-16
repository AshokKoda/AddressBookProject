package com.addressbookservice;

import java.util.List;

import com.addressbookmodel.Contact;

public interface IContacts {

	public void createContact();
	public List<Contact> printContacts();
	public void searchContact();
	public void deleteContact();
	public void updateContact();
	
}
