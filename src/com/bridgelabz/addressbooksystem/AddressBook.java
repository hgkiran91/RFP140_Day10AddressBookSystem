package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    static Scanner input = new Scanner(System.in);

    List<Contacts> contactsList = new ArrayList<>();

    public void addPerson() {
        Contacts contacts = new Contacts();

        System.out.println("Enter your first name: ");
        contacts.setFirstName(input.next());
        System.out.println("Enter your last name: ");
        contacts.setLastName(input.next());
        System.out.println("Enter your address: ");
        input.next();
        contacts.setAddress(input.nextLine());
        System.out.println("Enter your city: ");
        contacts.setCity(input.next());
        System.out.println("Enter your state: ");
        contacts.setState(input.next());
        System.out.println("Enter your zip: ");
        contacts.setZip(input.next());
        System.out.println("Enter your phone number: ");
        contacts.setPhoneNumber(input.next());
        System.out.println("Enter your email: ");
        contacts.setEmail(input.next());

        contactsList.add(contacts);
        System.out.println(contactsList);
    }

    public void editContact() {

        System.out.println("Enter the first name to edit: ");
        String fName = input.next();

        AddressBook addressBook = new AddressBook();

        for (int i = 0; i < contactsList.size(); i++) {
            Contacts contacts = (Contacts) contactsList.get(i);
            if (fName.equals(contacts.getFirstName())) {
                System.out.println(contacts);
                addressBook.addPerson();

                for (int j = 0; j < contactsList.size(); j++) {
                    contactsList.set(j, contacts);
                }
            }
        }
    }
}
