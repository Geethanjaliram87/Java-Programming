package JavaArraysandCollections.LibraryCatalog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryCatalog catalog = new LibraryCatalog();
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("4. Search by Title");
            System.out.println("5. Search by Author");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    catalog.addBook(new Book(title, author, isbn, year));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    if (catalog.removeBook(titleToRemove)) {
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    catalog.listBooks();
                    break;

                case 4:
                    System.out.print("Enter book title to search: ");
                    String titleToSearch = scanner.nextLine();
                    catalog.searchByTitle(titleToSearch);
                    break;

                case 5:
                    System.out.print("Enter author to search: ");
                    String authorToSearch = scanner.nextLine();
                    catalog.searchByAuthor(authorToSearch);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
