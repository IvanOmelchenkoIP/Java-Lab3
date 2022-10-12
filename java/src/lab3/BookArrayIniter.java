package lab3;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class BookArrayIniter {
	
	private final int MIN_AMOUNT = 10;
	private final Book[] BOOKS_DATA = {
		new Book("BookName1", "Author1", "Publisher1", 1998, 234, 126.99),
		new Book("BookName2", "Author1", "Publisher1", 2001, 324, 126.99),
		new Book("BookName3", "Author1", "Publisher1", 2002, 475, 126.99),
		new Book("BookName4", "Author1", "Publisher2", 2002, 209, 126.99),
		new Book("BookName5", "Author1", "Publisher2", 2003, 489, 126.99),
		new Book("BookName6", "Author2", "Publisher2", 2004, 507, 126.99),
		new Book("BookName7", "Author2", "Publisher1", 2005, 270, 126.99),
		new Book("BookName8", "Author3", "Publisher3", 2003, 214, 126.99),
		new Book("BookName9", "Author4", "Publisher3", 2004, 120, 126.99),
		new Book("BookName10", "Author4", "Publisher3", 2006, 704, 126.99),
		new Book("BookName11", "Author4", "Publisher3", 2001, 307, 126.99),
		new Book("BookName12", "Author5", "Publisher1", 2004, 248, 126.99),
		new Book("BookName13", "Author5", "Publisher1", 2004, 485, 126.99),
		new Book("BookName14", "Author6", "Publisher4", 2004, 903, 126.99),
		new Book("BookName15", "Author7", "Publisher4", 2006, 400, 126.99),
		new Book("BookName16", "Author8", "Publisher1", 2001, 198, 126.99),
		new Book("BookName17", "Author8", "Publisher1", 2003, 590, 126.99),
		new Book("BookName18", "Author8", "Publisher4", 2003, 528, 126.99),
		new Book("BookName19", "Author8", "Publisher4", 2005, 301, 126.99),
		new Book("BookName20", "Author8", "Publisher4", 2007, 204, 126.99),
	};
	
	public void init(BookArrayModel model) {
		Random random = new Random();
		int amount = random.nextInt((BOOKS_DATA.length - MIN_AMOUNT) + 1) + MIN_AMOUNT;
		
		ArrayList<Book> booksList = new ArrayList<Book>(Arrays.asList(BOOKS_DATA));
		Collections.shuffle(booksList);
		
		int first = random.nextInt((BOOKS_DATA.length - amount));
		for (int i = first; i < (first + amount); i++) model.addBook(booksList.get(i));
	}	
}
