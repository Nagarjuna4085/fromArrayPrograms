package ClassAndConstructor;

import java.util.ArrayList;

public class Library {

    ArrayList<String> books;

    // Constructor
    Library() {
        books = new ArrayList<>();
    }

    // Add book
    public void addBook(String book) {
        books.add(book);
    }

    // Remove book
    public void removeBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            System.out.println(book + " not found in library!");
        }
    }

    // Display books
    public void displayBooks() {
        System.out.println("Books in Library: " + books);
    }

    public static void main(String[] args) {

        // Create library object
        Library lib = new Library();

        // Add books
        lib.addBook("Java Basics");
        lib.addBook("Python Guide");
        lib.addBook("Data Structures");

        System.out.println("After adding books:");
        lib.displayBooks();

        // Remove book
        lib.removeBook("Python Guide");

        System.out.println("After removing book:");
        lib.displayBooks();
    }
}