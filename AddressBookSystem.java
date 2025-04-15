package com.bl.opps2;

public class AddressBookSystem {
	
	//Main method
	public static void main(String[] args) {
		System.out.println("Welcome to the AddressBookSystem Program!");
		
		// Create a object - contact
		Contact contact = new Contact(
						"Pavan",
						"M",
						"Kapgal Road",
						"Ballari",
						"Karnataka",
						583101,
						7363653521L,
						"pavan@gmail.com");

		// Display the contact
		System.out.println(contact);
	}

}
