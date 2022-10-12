package lab3;

public class Menue {
	
	private BookArrayController bookController;
	
	Menue(BookArrayController bookController) {
		this.bookController = bookController;
	}
	
	public void launch() {
		bookController.initBookArray();
	}
}
