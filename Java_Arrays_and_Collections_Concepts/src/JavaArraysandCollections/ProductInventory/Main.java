package JavaArraysandCollections.ProductInventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Products");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Category");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity in stock: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    inventory.addProduct(new Product(name, category, price, quantity));
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if (inventory.removeProduct(nameToRemove)) {
                        System.out.println("Product removed successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    inventory.listProducts();
                    break;

                case 4:
                    System.out.print("Enter product name to search: ");
                    String nameToSearch = scanner.nextLine();
                    inventory.searchByName(nameToSearch);
                    break;

                case 5:
                    System.out.print("Enter product category to search: ");
                    String categoryToSearch = scanner.nextLine();
                    inventory.searchByCategory(categoryToSearch);
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

