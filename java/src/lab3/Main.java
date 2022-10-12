package lab3;

public class Main {

	public static void main(String[] args) {
		BookArrayModel model = new BookArrayModel();
		BookArrayView view = new BookArrayView();
		BookArrayController controller = new BookArrayController(model, view);
		
		Menue menue = new Menue(controller); 
		menue.launch();
	}

}
