package menu;

import adt.linkedListADT;
import definition.linkedList;
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

    }

    @Override
    public void remove() {

    }

    @Override
    public E search() {
        return null;
    }

    @Override
    public void view() {

    }
}
