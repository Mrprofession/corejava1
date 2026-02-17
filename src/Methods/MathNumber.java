package Methods;

public class MathNumber {

	public void findMax(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else {
			System.out.println("c is greater");
		}
	}

	public static void main(String[] args) {
		MathNumber m1 = new MathNumber();
		m1.findMax(70, 60, 50);

	}

}
