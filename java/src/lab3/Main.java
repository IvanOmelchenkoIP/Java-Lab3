package lab3;

public class Main {

	public static void main(String[] args) {
		BookArrayModel booksModel = new BookArrayModel();
		BookArrayView booksView = new BookArrayView();
		BookArrayController books = new BookArrayController(booksModel, booksView);
		
		MenueModel menueModel = new MenueModel();
		MenueView menueView = new MenueView();
		MenueController menue = new MenueController(menueModel, menueView, books); 
		menue.launch();
	}

}
