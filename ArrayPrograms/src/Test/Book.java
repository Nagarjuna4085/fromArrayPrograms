package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {

	String title;
	String author;
	String isbn;
	ArrayList<Book> books;
	
	public Book() {
		this.books = new ArrayList();
	}

	public Book(String tit, String au, String isbn) {
		// TODO Auto-generated constructor stub
		// title,author,isbn
		this.author = au;
		this.title = tit;
		this.isbn = isbn;

	}

	public void addbook(Book b) {
		if (books == null) books = new ArrayList<>();
		books.add(b);

	}

	public String removeBook(Book b) {
		
		if (books == null) return "List is empty";
		   Iterator<Book> it  = books.iterator();
		   while(it.hasNext()) {
			   Book bk = it.next();
			   if(bk.title.equals(b.title)) {
				   it.remove();
				   return "Book '" + b.title + "' removed successfully";
			   }
			   
		   }
		   return "No book found";
		
		
	}

	public static void main(String[] args) {
		Book library = new Book();
		Book math = new Book("Calculus 101", "Newton", "123-ABC");
        Book history = new Book("World History", "Herodotus", "456-DEF");
        Book physics = new Book("Light", "dfgh", "456098765redfghj");
        library.addbook(math);
        library.addbook(history);
        library.addbook(physics);
        library.removeBook(math);
        
        for(Book b:library.books) {
        	System.out.println(b.author);
        }

	}

}
