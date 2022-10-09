package lab3;

public class Book {
	
	private String name;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private double price;
	
	Book(String name, String author, String publisher, int year, int pages, double price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
	}
}
