package com.bl.opps2;

public class Contact {
	
	 // Fields for contact details
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;

    // Constructor
    public Contact(String firstName, String lastName, String address, String city,
            String state, int zip2, long phoneNumber2, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip2;
        this.phoneNumber = phoneNumber2;
        this.email = email;
    }

    // Method to display contact details
    public void displayContact() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("ZIP: " + zip);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }

}
