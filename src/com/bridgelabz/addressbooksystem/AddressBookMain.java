package com.bridgelabz.addressbooksystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        //addressBook.addPerson();
        //addressBook.editContact();
        //addressBook.deleteContact();
        //addressBook.addMultipleContact();
        addressBook.addMultipleAddressBook();
    }
}
