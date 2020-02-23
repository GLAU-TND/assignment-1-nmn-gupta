package menu;

import adt.linkedListADT;
import definition.linkedList;
import node.Node;
import person.Person;

import java.util.Scanner;

public class linkedListMenu<E> implements linkedListADT<E> {
    private definition.linkedList<Person> myLinkedList;
    private Scanner sc;

    public linkedListMenu() {
        sc = new Scanner(System.in);
        myLinkedList = new linkedList<>();
    }

    @Override
    public void add() {

        Person person = new Person();
        String name;
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person\n");


        System.out.print("First Name: ");
        name = sc.nextLine().trim();
        person.setFirstName(name);

        System.out.print("Last Name: ");
        name = sc.nextLine().trim();
        person.setLastName(name);

        String number;
        System.out.print("Contact Number: ");
        number = sc.nextLine().trim();
        person.setPhoneNumbers(number);

        char c;
        System.out.print("Would you like to add another contact number? (y/n): ");
        c = sc.nextLine().trim().charAt(0);
        while (c == 'y') {
            System.out.print("Contact Number: ");
            number = sc.nextLine().trim();
            person.setPhoneNumbers(number);

            System.out.print("Would you like to add another contact number? (y/n): ");
            c = sc.nextLine().trim().charAt(0);
        }


        String email = null;
        System.out.print("Would you like to add email address? (y/n): ");
        c = sc.nextLine().trim().charAt(0);
        if (c == 'y') {
            System.out.print("Email Address: ");
            email = sc.nextLine().trim();
            person.setEmailID(email);
            //System.out.println("y");
        } else {
            person.setEmailID("");
            //System.out.println("n");
        }
        System.out.println("contact is saved in the list!!");
        Node<Person> node = new Node<>();
        node.setData(person);
        myLinkedList.insert(node);

    }


    @Override
    public void remove() {

        System.out.println("Here are all your contacts:");
        int i = 1;
        while (true) {
            Node<Person> node = myLinkedList.getObject();
            if (node == null)
                break;
            System.out.println(i + ". " + node.getData().getFirstName() + " " + node.getData().getLastName());
            i++;
        }
        System.out.print("Press the number against the contact to delete it: ");
        int position = sc.nextInt();
        Person person = myLinkedList.deleteFromPosition(position).getData();

        System.out.println(person.getFirstName() + " " + person.getLastName() + "'s contact deleted from list!");

    }

    @Override
    public void search() {
        int counter = 0;
        System.out.print("You could search for a contact from their first names: ");
        sc.nextLine();
        String name = sc.nextLine().trim();

        while (true) {
            Node<Person> node = myLinkedList.getObject();
            if (node == null)
                break;
            if (node.getData().getFirstName().compareTo(name) == 0)
                counter++;
        }

        System.out.println(counter + " match found!");
        while (true) {
            Node<Person> node = myLinkedList.getObject();
            if (node == null)
                break;
            if (node.getData().getFirstName().compareTo(name) == 0)
                System.out.println(node.getData());
        }

    }

    // Helper method to sort the contact list.
    private void sortList(linkedList<Person> linkedList) {
        myLinkedList.sort();
    }

    @Override
    public void view() {
        sortList(myLinkedList);
        while (true) {
            Node<Person> node = myLinkedList.getObject();
            if (node == null)
                break;
            System.out.println(node.getData());
        }
    }


}
