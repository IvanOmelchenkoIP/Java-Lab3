package lab3.book.unittests;

import java.util.ArrayList;
import lab3.book.Book;
import lab3.book.array.BookArrayModel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookArrayTests {

	@Test
	void GetEmptyBookArrayTest() {
		ArrayList<Book> expected = new ArrayList<Book>();
		
		BookArrayModel model = new BookArrayModel();
		ArrayList<Book> received = model.getBooks();
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetFilledBookArrayTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		expected.add(new Book("N1", "A1", "P1", 1, 1, 1.0));
		expected.add(new Book("N2", "A1", "P2", 1, 1, 1.0));
		expected.add(new Book("N3", "A2", "P1", 1, 1, 1.0));
		
		BookArrayModel model = new BookArrayModel();
	    model.addBook(new Book("N1", "A1", "P1", 1, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 1, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 1, 1, 1.0));
		ArrayList<Book> received = model.getBooks();
		
		assertTrue(expected.toString().contentEquals(received.toString()));
	}
	
	@Test
	void GetBooksOfAuthorEmptyTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		
		BookArrayModel model = new BookArrayModel();
		ArrayList<Book> received = model.getBooksOfAuthor("A1");
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetBooksOfAuthorNoneTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();		
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P1", 1, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 1, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 1, 1, 1.0));
		ArrayList<Book> received = model.getBooksOfAuthor("A3");
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetBooksOfAuthorCompleteTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		expected.add(new Book("N1", "A1", "P1", 1, 1, 1.0));
		expected.add(new Book("N2", "A1", "P2", 1, 1, 1.0));
		expected.add(new Book("N4", "A1", "P1", 1, 1, 1.0));
		expected.add(new Book("N6", "A1", "P1", 1, 1, 1.0));
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P1", 1, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 1, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 1, 1, 1.0));
		model.addBook(new Book("N4", "A1", "P1", 1, 1, 1.0));
		model.addBook(new Book("N5", "A3", "P1", 1, 1, 1.0));
		model.addBook(new Book("N6", "A1", "P1", 1, 1, 1.0));
		ArrayList<Book> received = model.getBooksOfAuthor("A1");
		
		assertTrue(expected.toString().contentEquals(received.toString()));
	}
	
	@Test
	void GetBooksOfPublisherEmptyTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();		
		
		BookArrayModel model = new BookArrayModel();
		ArrayList<Book> received = model.getBooksOfPublisher("P1");
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetBooksOfPublisherNoneTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();		
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P1", 1, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 1, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 1, 1, 1.0));
		ArrayList<Book> received = model.getBooksOfAuthor("P3");
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetBooksOfPublisherCompleteTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		expected.add(new Book("N1", "A1", "P1", 1, 1, 1.0));
		expected.add(new Book("N3", "A2", "P1", 1, 1, 1.0));
		expected.add(new Book("N6", "A1", "P1", 1, 1, 1.0));
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P1", 1, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 1, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 1, 1, 1.0));
		model.addBook(new Book("N4", "A1", "P2", 1, 1, 1.0));
		model.addBook(new Book("N5", "A3", "P4", 1, 1, 1.0));
		model.addBook(new Book("N6", "A1", "P1", 1, 1, 1.0));
		ArrayList<Book> received = model.getBooksOfPublisher("P1");
		
		assertTrue(expected.toString().contentEquals(received.toString()));
	}
	
	@Test
	void GetBooksAfterYearEmptyTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		
		BookArrayModel model = new BookArrayModel();
		ArrayList<Book> received = model.getBooksAfterYear(1);
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetBooksAfterYearNoneTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();		
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P1", 1, 1997, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 1, 1998, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 1, 2001, 1.0));
		ArrayList<Book> received = model.getBooksAfterYear(2003);
		
		assertEquals(expected, received);
	}
	
	@Test
	void GetBooksAfterYearCompleteTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		expected.add(new Book("N1", "A1", "P1", 2011, 1, 1.0));
		expected.add(new Book("N4", "A1", "P2", 2004, 1, 1.0));
		expected.add(new Book("N6", "A1", "P1", 2006, 1, 1.0));
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P1", 2011, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 2001, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 2003, 1, 1.0));
		model.addBook(new Book("N4", "A1", "P2", 2004, 1, 1.0));
		model.addBook(new Book("N5", "A3", "P4", 1993, 1, 1.0));
		model.addBook(new Book("N6", "A1", "P1", 2006, 1, 1.0));
		ArrayList<Book> received = model.getBooksAfterYear(2003);
		
		assertTrue(expected.toString().contentEquals(received.toString()));
	}
	
	@Test
	void SortBooksByPublisherEmptyTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		
		BookArrayModel model = new BookArrayModel();
		ArrayList<Book> received = model.sortBooksByPublisher();
		
		assertEquals(expected, received);
	}
	
	@Test
	void SortBooksByPublisherCompleteTest() {		
		ArrayList<Book> expected = new ArrayList<Book>();
		expected.add(new Book("N3", "A2", "P1", 2003, 1, 1.0));
		expected.add(new Book("N6", "A1", "P1", 2006, 1, 1.0));
		expected.add(new Book("N2", "A1", "P2", 2001, 1, 1.0));
		expected.add(new Book("N4", "A1", "P2", 2004, 1, 1.0));
		expected.add(new Book("N1", "A1", "P3", 2011, 1, 1.0));
		expected.add(new Book("N5", "A3", "P4", 1993, 1, 1.0));
		
		BookArrayModel model = new BookArrayModel();
		model.addBook(new Book("N1", "A1", "P3", 2011, 1, 1.0));
		model.addBook(new Book("N2", "A1", "P2", 2001, 1, 1.0));
		model.addBook(new Book("N3", "A2", "P1", 2003, 1, 1.0));
		model.addBook(new Book("N4", "A1", "P2", 2004, 1, 1.0));
		model.addBook(new Book("N5", "A3", "P4", 1993, 1, 1.0));
		model.addBook(new Book("N6", "A1", "P1", 2006, 1, 1.0));
		ArrayList<Book> received = model.sortBooksByPublisher();
		
		assertTrue(expected.toString().contentEquals(received.toString()));
	}
}
