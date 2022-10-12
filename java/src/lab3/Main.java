package lab3;

import lab3.book.array.*;
import lab3.menu.*;

public class Main {

	public static void main(String[] args) {
		BookArrayModel booksModel = new BookArrayModel();
		BookArrayView booksView = new BookArrayView();
		BookArrayController books = new BookArrayController(booksModel, booksView);
		
		MenuModel menuModel = new MenuModel();
		MenuView menuView = new MenuView();
		MenuController menu = new MenuController(menuModel, menuView, books); 
		menu.launch();
	}

}
