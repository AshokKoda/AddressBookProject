package com.addressbook;

import java.util.Scanner;

import com.addressbookservice.ContactImplementation;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("<-----------Welcome To Address Book Management----------->");

		Scanner sc = new Scanner(System.in);
		System.out.println("*************Address Book***************");

		ContactImplementation contactService = new ContactImplementation();
		boolean exit = false;
		int choice;

		while (!exit) {
			System.out.println(
					"1.Create Contact\t 2.Show Contacts\t 3.Search Contact\t 4.Delete Contact\t 5.Update Contact\t 6.Quit");
			System.out.println("Enter your option: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				contactService.createContact();
				System.out.println("<------------------------------------------>");
				break;
			case 2:
				contactService.printContacts();
				System.out.println("<------------------------------------------>");
				break;
			case 3:
				contactService.searchContact();
				break;
			case 4:
				contactService.deleteContact();
				break;
			case 5:
				contactService.updateContact();
				break;
			case 6:
				exit = true;
				System.out.println("**********Thank you.....!!!*********");
				break;
			default:
				System.out.println("Application is quit...");
			}
		}

	}

}
