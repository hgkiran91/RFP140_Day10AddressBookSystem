package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    static Scanner input = new Scanner(System.in);

    List<Contacts> contactsList = new ArrayList<>();

    HashMap<Integer, AddressBook> addressBookNum = new HashMap<>();

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

        //AddressBook addressBook = new AddressBook();

        for (int i = 0; i < contactsList.size(); i++) {
            Contacts contacts = contactsList.get(i);
            if (fName.equals(contacts.getFirstName())) {
                while (true) {
                    System.out.println("Enter choice to edit: 1)firstName\n2)lastName\n3)address\n"
                            + "4)city\n5)state\n6)zip\n7)phoneNumber\n8)email9)exit");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            contacts.setFirstName(input.next());
                            break;
                        case 2:
                            contacts.setLastName(input.next());
                            break;
                        case 3:
                            contacts.setAddress(input.next());
                            break;
                        case 4:
                            contacts.setCity(input.next());
                            break;
                        case 5:
                            contacts.setState(input.next());
                            break;
                        case 6:
                            contacts.setZip(input.next());
                            break;
                        case 7:
                            contacts.setPhoneNumber(input.next());
                            break;
                        case 8:
                            contacts.setEmail(input.next());
                            break;
                        default:
                            System.out.println("select correct choice");
                            break;
                    }// end of switch
                    if (choice == 9)
                        break;
                }
                contactsList.set(i, contacts);
                System.out.println("contacts after editing");
                System.out.println(contactsList);
            }
        }
    }

    public void deleteContact() {

        System.out.println("Enter the first name to edit: ");
        String fName = input.next();

        for (int i = 0; i < contactsList.size(); i++) {
            Contacts contacts = (Contacts) contactsList.get(i);
            if (fName.equals(contacts.getFirstName())) {
                System.out.println(contacts);
                contactsList.remove(i);
                System.out.println(contactsList.isEmpty());
            }
        }
    }

    public void addMultipleContact() {
        while(true){
            System.out.println(
                    "Enter the option \n1)To Add Contect\n2)To Edit Contact" + "\n3)To Delete Contact\n4)exit");
            int option = input.nextInt();
            switch (option){
                case 1 -> addPerson();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> System.out.println("Exiting");
                default -> System.out.println("Invalid option");
            }
            if (option==4)
                break;
        }
    }

    public void addMultipleAddressBook() {

        while (true) {

            System.out.println("Enter the \n1)to access address book\n2)0 to exit");
            int option = input.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exiting from addressbooks");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Enter the addressbook number");
                    int N = input.nextInt();
                    System.out.printf("welcome to addressbook_%d\n", N);
                    if (addressBookNum.containsKey(N)) {
                        System.out.printf("addressbook_%d is already present you cannot add one more time\n", N);
                        break;
                    } else {
                        AddressBook addr = new AddressBook();
                        addr.addMultipleContact();
                        addressBookNum.put(N, addr);
                        break;
                    }

                default:
                    System.out.println("select valid option");
                    break;
            }

        }
    }
}
