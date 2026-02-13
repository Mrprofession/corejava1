package ConditionalStatement;

import java.util.Scanner;

public class AssignmentC12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("It is positive number");
		} else if (a < 0) {
			System.out.println("It is negative number");
		} else if (a == 0) {
			System.out.println("It is zero");

		}
	}

}
