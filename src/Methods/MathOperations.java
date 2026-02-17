package Methods;

public class MathOperations {

	static void multiplyNumbers(int a, int b) {
		int multiply = a * b;
		System.out.println("multiply result is = " + multiply);
	}

	void addNumbers(int c, int d) {
		System.out.println("sum = " + (c + d));
	}

	public static void main(String[] args) {
		multiplyNumbers(5, 6);
		MathOperations m1 = new MathOperations();
		m1.addNumbers(10, 20);

	}

}
