package Corejavatest;


public class Book {
	String title;
	String author;
	int price;

	Book(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	void displayDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
	}

	public static void main(String[] args) {
		Book b1 = new Book("Testing fundamentals", "Kp sharma", 1000);
		b1.displayDetails();

		Book b2 = new Book("Software testing", "KP", 2000);
		b2.displayDetails();

	}

}
