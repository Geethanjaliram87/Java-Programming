package JavaArraysandCollections.EmailList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();
        int choice;

        do {
            System.out.println("\n1. Add Email");
            System.out.println("2. Remove Email");
            System.out.println("3. List Emails");
            System.out.println("4. Check Email");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter email address to add: ");
                    String emailToAdd = scanner.nextLine();
                    if (emailList.addEmail(emailToAdd)) {
                        System.out.println("Email added successfully!");
                    } else {
                        System.out.println("Email is already in the list.");
                    }
                    break;

                case 2:
                    System.out.print("Enter email address to remove: ");
                    String emailToRemove = scanner.nextLine();
                    if (emailList.removeEmail(emailToRemove)) {
                        System.out.println("Email removed successfully!");
                    } else {
                        System.out.println("Email not found.");
                    }
                    break;

                case 3:
                    emailList.listEmails();
                    break;

                case 4:
                    System.out.print("Enter email address to check: ");
                    String emailToCheck = scanner.nextLine();
                    if (emailList.checkEmail(emailToCheck)) {
                        System.out.println(emailToCheck + " is in the list.");
                    } else {
                        System.out.println(emailToCheck + " is not in the list.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
