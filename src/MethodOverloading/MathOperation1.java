package MethodOverloading;

public class MathOperation1 {
	void multiply(int a, int b) {
		System.out.println("Multiplication (int):" + (a * b));
	}

	void multiply(double a, double b) {
		System.out.println("Multiplication (double):" + (a * b));
	}
}
