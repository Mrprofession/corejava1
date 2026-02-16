package IterativeStatement;

public class dowhileexample7 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
            i++;
        } while (i <= 100);

        System.out.println("Sum is = " + sum);
    }
}
