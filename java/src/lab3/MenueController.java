package lab3;

public class MenueController {
	
	private MenueModel model;
	private MenueView view;
	
	private BookArrayController books;
	
	MenueController(MenueModel model, MenueView view, BookArrayController books) {
		this.model = model;
		this.view = view;
		this.books = books;
	}
	
	public void launch() {
		books.initBookArray();
		
		while(true) {
		}
	}	
}
