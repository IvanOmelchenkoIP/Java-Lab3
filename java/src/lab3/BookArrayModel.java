package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookArrayModel {
	
	private ArrayList<Book> books;
	
	BookArrayModel() {
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public ArrayList<Book> getBooksOfAuthor(String author) {
		ArrayList<Book> selected = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getAuthor() == author) selected.add(book);
		}
		return selected;
	}
	
	public ArrayList<Book> getBooksOfPublisher(String publisher) {
		ArrayList<Book> selected = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getPublisher() == publisher) selected.add(book);
		}
		return selected;
	}
	
	public ArrayList<Book> getBooksAfterYear(int year) {
		ArrayList<Book> selected = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getYear() > year) selected.add(book);
		}
		return selected;
	}
	
	public ArrayList<Book> sortBooksByPublisher() {
		Comparator<Book> comparator = new BookPublisherComparator();
		ArrayList<Book> sorted = (ArrayList<Book>)books.clone();
		Collections.sort(sorted, comparator);
		return sorted;
	}
}

