package lab3.menu;

import lab3.book.array.BookArrayController;
import lab3.menu.scanner.InputScanner;

public class MenuController {
	
	private boolean runFlag = true;
	
	private MenuModel model;
	private MenuView view;
	
	private BookArrayController books;
	
	public MenuController(MenuModel model, MenuView view, BookArrayController books) {
		this.model = model;
		this.view = view;
		this.books = books;
	}
	
	public void launch() {
		books.initBookArray();
		
		while(runFlag) {
			view.printMenuMessage(MenuView.MENU);
			view.printMenuMessage(MenuView.INPUT_FIELD);
			
			String input = InputScanner.scan();
			runFlag = model.processInput(input);
		}
		view.printMenuMessage(MenuView.EXIT);	
	}	
}
