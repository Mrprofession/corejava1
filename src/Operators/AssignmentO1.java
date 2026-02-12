package Operators;

import java.util.Scanner;

public class AssignmentO1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a an b");
			
			
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("addition:"+(a+b));
		System.out.println("Substraction: "+(a-b));
		System.out.println("multiplication: "+(a*b));
		System.out.println("division: "+ (a/b));
		System.out.println("modulous: " +(a%b));
	}

}
