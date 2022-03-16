package com.addressbookservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.addressbookmodel.Contact;

public class ContactImplementation implements IContacts {

	String fName, lName, city, state;
	Contact contact = new Contact(fName, lName, city, state);
	List<Contact> listContacts = new ArrayList<Contact>();

	@Override
	public void createContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your firstname: ");
		fName = sc.nextLine();
		System.out.println("Enter your lastname: ");
		lName = sc.nextLine();
		System.out.println("Enter your city: ");
		city = sc.nextLine();
		System.out.println("Enter your state: ");
		state = sc.nextLine();

		listContacts.add(new Contact(fName, lName, city, state));
		System.out.println("Contact added successfully............!!!!!!");
	}

	@Override
	public List<Contact> printContacts() {
		if (listContacts.isEmpty()) {
			System.out.println("No Records!!!");
		} else {
			System.out.println("------------------------------------------");
			System.out.println("**************Show All Contact*************");
			Iterator<Contact> iterator = listContacts.iterator();
			while (iterator.hasNext()) {
				Contact c = iterator.next();
				System.out.println(c);
			}
			System.out.println("------------------------------------------");
		}
		return listContacts;
	}

	@Override
	public void searchContact() {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("------------------------------------------");
		System.out.println("**************Search Contact*************");
		System.out.println("Enter person firstname to search: ");
		String fName = sc.next();
		Iterator<Contact> iterator = listContacts.iterator();
		while (iterator.hasNext()) {
			Contact c = iterator.next();
			if (fName.equalsIgnoreCase(c.getFirstName())) {
				System.out.println(c);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Record not found to search with is name: " + fName);
		}
		System.out.println("------------------------------------------");
	}

	@Override
	public void deleteContact() {
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("------------------------------------------");
		System.out.println("**************Delete Contact*************");
		System.out.println("Enter person firstname to delete: ");
		String fName = sc.next();
		Iterator<Contact> iterator = listContacts.iterator();
		while (iterator.hasNext()) {
			Contact c = iterator.next();
			if (fName.equalsIgnoreCase(c.getFirstName())) {
				iterator.remove();
				found = true;
			}
		}
		if (!found) {
			System.out.println("Record not found to delete with is name: " + fName);
		} else {
			System.out.println("Contact is deleted successfully.........!!!!!!");
		}
		System.out.println("------------------------------------------");
	}

	@Override
	public void updateContact() {
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person firstname to update: ");
		String uName = sc.next();
		System.out.println("------------------------------------------");
		ListIterator<Contact> li = listContacts.listIterator();
		while (li.hasNext()) {
			Contact c = li.next();
			if (uName.equalsIgnoreCase(c.getFirstName())) {
				System.out.println("**************Update Contact*************");
				System.out.println("Enter new firstname: ");
				String fName = sc.next();
				System.out.println("Enter new lastname: ");
				String lName = sc.next();
				System.out.println("Enter new city: ");
				String city = sc.next();
				System.out.println("Enter new state: ");
				String state = sc.next();
				
				li.set(new Contact(fName, lName, city, state));
				found = true;
			}
		}
		if (!found) {
			System.out.println("Record not found to update with is name: " + uName);
		} else {
			System.out.println("Contact is updated successfully.........!!!!!!");
		}
		System.out.println("------------------------------------------");

	}

}
