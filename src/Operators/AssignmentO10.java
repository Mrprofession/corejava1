package Operators;

public class AssignmentO10 {

	public static void main(String[] args) {
		int a = 5;
        int b = 3;

        int result = ++a - --b + a-- - b++;
        System.out.println("Result: " + result);
        System.out.println("Final a: " + a);
        System.out.println("Final b: " + b);

	}

}
