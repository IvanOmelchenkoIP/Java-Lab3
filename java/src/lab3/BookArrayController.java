package lab3;

public class BookArrayController {
	BookArrayModel model;
	BookArrayView view;
	
	BookArrayController(BookArrayModel model, BookArrayView view) {
		this.model = model;
		this.view = view;
	}
	
	public void initBookArray(Book[] books) {
		for (Book book : books) model.addBook(book);
		view.printInitMessage(books.length);
	}
	
	public void getBooksOfAuthor() {
		
	}
	
	public void getBooksOfPublisher() {
		
	}
	
	public void getBooksAfterYear() {
		
	}
	
	public void sortBooksByPublisher() {
		
	}
}
