package Constructor;

public class Book1 {
	String title;
	String author;
	int price;

	Book1(String t, String a, int p) {
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
		Book1 b1 = new Book1("Testing fundamentals", "Kp sharma", 1000);
		b1.displayDetails();

		Book1 b2 = new Book1("Software testing", "KP", 2000);
		b2.displayDetails();

	}

}
