package lab3;

public class Book {
	
	private String name;
	private String author;
	private String publishHouse;
	private String publishYear;
	private String pages;
	private String price;
	
	Book(String name, String author, String pHouse, String pYear, String pages, String price) {
		this.name = name;
		this.author = author;
		this.publishHouse = pHouse;
		this.publishYear = pYear;
		this.pages = pages;
		this.price = price;
	}
}
