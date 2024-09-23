package JavaArraysandCollections.ProductInventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Adds a new product to the inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Removes a product by name
    public boolean removeProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    // Lists all products in the inventory
    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in the inventory.");
        } else {
            System.out.println("Product List:");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
        }
    }

    // Searches for products by name
    public void searchByName(String name) {
        ArrayList<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                foundProducts.add(product);
            }
        }
        displaySearchResults(foundProducts);
    }

    // Searches for products by category
    public void searchByCategory(String category) {
        ArrayList<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                foundProducts.add(product);
            }
        }
        displaySearchResults(foundProducts);
    }

    // Displays search results
    private void displaySearchResults(ArrayList<Product> foundProducts) {
        if (foundProducts.isEmpty()) {
            System.out.println("No products found.");
        } else {
            System.out.println("Found the following products:");
            for (int i = 0; i < foundProducts.size(); i++) {
                System.out.println((i + 1) + ". " + foundProducts.get(i));
            }
        }
    }
}

