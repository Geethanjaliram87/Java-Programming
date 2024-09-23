package JavaArraysandCollections.LibraryCatalog;

import java.util.ArrayList;

public class LibraryCatalog {
    private ArrayList<Book> books;

    public LibraryCatalog() {
        books = new ArrayList<>();
    }

    // Adds a new book to the catalog
    public void addBook(Book book) {
        books.add(book);
    }

    // Removes a book by title
    public boolean removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    // Lists all books in the catalog
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the catalog.");
        } else {
            System.out.println("Book List:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    // Searches for books by title
    public void searchByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        displaySearchResults(foundBooks);
    }

    // Searches for books by author
    public void searchByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        displaySearchResults(foundBooks);
    }

    // Displays search results
    private void displaySearchResults(ArrayList<Book> foundBooks) {
        if (foundBooks.isEmpty()) {
            System.out.println("No books found.");
        } else {
            System.out.println("Found the following books:");
            for (int i = 0; i < foundBooks.size(); i++) {
                System.out.println((i + 1) + ". " + foundBooks.get(i));
            }
        }
    }
}

