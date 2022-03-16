package com.addressbookservice;

import java.util.Scanner;

public class AddressBookImple implements IAddressBook {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void createAddressBook() {
		System.out.println("*************Address Book***************");
		System.out.println("*************Add New Address Book*************");
		System.out.println("Enter Address Book Name: ");
		String name = sc.nextLine();
		System.out.println("Address Book Name is : " + name);
	}
}
