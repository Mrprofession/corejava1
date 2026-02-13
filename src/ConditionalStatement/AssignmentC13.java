package ConditionalStatement;

public class AssignmentC13 {

	public static void main(String[] args) {
		int a = 0;

		if (a > 0) {
			System.out.println("Number is positive");

			if (a % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}

		} else if (a == 0) {
			System.out.println("Number is zero");

		} else {
			System.out.println("Number is negative");
		}
	}
}
