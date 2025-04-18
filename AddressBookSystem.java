package com.bl.opps2;

import java.util.Scanner;

public class AddressBookSystem {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome to Address Book program");
		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter Address: ");
		String address = scanner.nextLine();

		System.out.print("Enter City: ");
		String city = scanner.nextLine();

		System.out.print("Enter State: ");
		String state = scanner.nextLine();

		System.out.print("Enter ZIP: ");
		int zip = scanner.nextInt();

		System.out.print("Enter Phone Number: ");
		long phoneNumber = scanner.nextLong();

		System.out.print("Enter Email: ");
		String email = scanner.nextLine();

		// Create ContactPerson object
		Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		// Add to AddressBook
		addressBook.addContact(newContact);
		System.out.println();
		// printing that contacts has been successfully added
		System.out.println("\nContact added successfully! Here's your Address Book:");
		addressBook.displayContacts();

		// Ask if user wants to edit any contact
		System.out.print("\nEnter the first or last name of the contact you want to edit: ");
		String nameToEdit = scanner.nextLine();

		// Edit contact based on name
		addressBook.editContact(nameToEdit);

		// Delete a contact based on a name
		System.out.println("Do you want to delete the contact? Y/N");
		String deleteChoice = scanner.nextLine();

		if (deleteChoice.equalsIgnoreCase("y")) {
			System.out.println("Enter the first or last name of the contact that you want to delete");
			String nameToDelete = scanner.nextLine();
			addressBook.deleteContact(nameToDelete);

			System.out.println("\n Updated Address Book: ");
			addressBook.displayContacts();
		}
		scanner.close();
	}
}
