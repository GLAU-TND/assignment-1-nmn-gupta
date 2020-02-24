package main;

import menu.linkedListMenu;

import java.util.Scanner;

public class Main {
    public static void 1

    main(String[] args) {
        linkedListMenu obj = new linkedListMenu();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.println("Welcome to Naman's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    obj.view();
                    break;
                case 3:
                    obj.search();
                    break;
                case 4:
                    obj.remove();
                    break;
                case 5:
                    System.exit(0);
                    //flag = false;
                    //break;
            }
        }
    }
}

