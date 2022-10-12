package lab3.menu;

public class MenuView {
	
	public static String MENU = "1) find books by publisher\n2) find books by author\n3) find books after year\n4) sort books by publisher\n5) exit";
	public static String INPUT_FIELD = "Enter a number corresponding menu item. Your input > ";
	public static String EXIT = "Exiting the program...\n";
	
	public void printMenuMessage(String message) {
		System.out.print(message);
	}
}
