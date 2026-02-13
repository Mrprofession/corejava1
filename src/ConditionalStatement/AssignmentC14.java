package ConditionalStatement;

public class AssignmentC14 {

    public static void main(String[] args) {

        int marks = 85;
        int math = 78;

        if (marks >= 80) {

            if (math >= 75) {
                System.out.println("Eligible");
            } 
            else {
                System.out.println("Not Eligible");
            }

        } 
        else {
            System.out.println("Not Eligible");
        }

    }
}
