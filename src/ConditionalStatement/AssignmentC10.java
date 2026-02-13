package ConditionalStatement;

import java.util.Scanner;

public class AssignmentC10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature");
		int temp = sc.nextInt();
		
		
		if (temp > 30) {
		System.out.println("It's hot");
	}
		else if (20<= temp && temp >= 30) {
		System.out.println("Its Warm");
		}
		else if (10<= temp && temp >= 19) {
		System.out.println("Its Cold");
		}
		else if (temp < 10) {
			System.out.println("Its Very Cold");
		

	}
	}
}
	
