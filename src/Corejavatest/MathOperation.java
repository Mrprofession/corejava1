package Corejavatest;

public class MathOperation {

	static void multiplyNumbers(int a, int b) {
		int multiply = a * b;
		System.out.println("multiply result is = " + multiply);
	}

	void addNumbers(int c, int d) {
		System.out.println("sum = " + (c + d));
	}

	public static void main(String[] args) {
		multiplyNumbers(5, 6);
		MathOperation m1 = new MathOperation();
		m1.addNumbers(10, 20);

	}

}
