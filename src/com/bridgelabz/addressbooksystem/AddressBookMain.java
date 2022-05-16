package com.bridgelabz.addressbooksystem;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        //addressBook.addPerson();
        //addressBook.editContact();
        //addressBook.deleteContact();
        addressBook.addMultipleContact();
    }
}
