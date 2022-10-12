package lab3.book.array;

import java.util.ArrayList;

import lab3.book.Book;
import lab3.book.initer.BookArrayIniter;

public class BookArrayController {
	private BookArrayModel model;
	private BookArrayView view;
	
	public BookArrayController(BookArrayModel model, BookArrayView view) {
		this.model = model;
		this.view = view;
	}
	
	public void initBookArray() {
		BookArrayIniter.init(model);
		ArrayList<Book> bookList = model.getBooks();
		view.printInitMessage(bookList);
	}
	
	public void getBooksOfAuthor(String author) {
		ArrayList<Book> selected = model.getBooksOfAuthor(author);
		view.printOperationMessage(selected, BookArrayView.SUCCESS_SELECT_BY_AUTHOR, BookArrayView.ERR_SELECT_BY_AUTHOR);
	}
	
	public void getBooksOfPublisher(String publisher) {
		ArrayList<Book> selected = model.getBooksOfAuthor(publisher);
		view.printOperationMessage(selected, BookArrayView.SUCCESS_SELECT_BY_PUBLISHER, BookArrayView.ERR_SELECT_BY_PUBLISHER);
	}
	
	public void getBooksAfterYear(int year) {
		ArrayList<Book> selected = model.getBooksAfterYear(year);
		view.printOperationMessage(selected, BookArrayView.SUCCESS_SELECT_AFTER_YEAR, BookArrayView.ERR_SELECT_AFTER_YEAR);
	}
	
	public void sortBooksByPublisher() {
		ArrayList<Book> selected = model.sortBooksByPublisher();
		view.printOperationMessage(selected, BookArrayView.SUCCESS_SORT_BY_PUBLISHER, BookArrayView.ERR_SORT_BY_PUBLISHER);
	}
}
