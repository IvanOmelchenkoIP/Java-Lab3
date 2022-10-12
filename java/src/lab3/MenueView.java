package lab3;

public class MenueView {
	
	public static String MENUE = "Print '1' to find books by publisher\nPrint '2' to find books by author\nPrint '3' to find books after year\nPrint '4' to sort books by publisher\n";
	public static String INPUT_FIELD = "Your input > ";
	public static String EXIT = "Exiting the program...\n";
	
	public void printMenueMessage(String message) {
		System.out.print(message);
	}
}
