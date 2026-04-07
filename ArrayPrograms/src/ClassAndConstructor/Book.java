package ClassAndConstructor;

import java.util.ArrayList;

public class Book {

    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println(title + " | " + author + " | " + isbn);
    }

    public static void main(String[] args) {

        // Collection to store books
        ArrayList<Book> bookCollection = new ArrayList<>();

        // Creating books
        Book b1 = new Book("Java Basics", "James", "111");
        Book b2 = new Book("Python Guide", "Guido", "222");
        Book b3 = new Book("C++ Mastery", "Bjarne", "333");

        // Add books to collection
        bookCollection.add(b1);
        bookCollection.add(b2);
        bookCollection.add(b3);

        System.out.println("📚 Books after adding:");
        for (Book b : bookCollection) {
            b.displayBook();
        }

        // Remove a book (example: remove b2)
        bookCollection.remove(b2);

        System.out.println("\n📚 Books after removing Python Guide:");
        for (Book b : bookCollection) {
            b.displayBook();
        }
    }
}