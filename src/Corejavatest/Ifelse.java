package Corejavatest;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();

       
        if (num >= 0) {
            System.out.println("The number is Positive");

            
            if (num % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }

        } else {
            System.out.println("The number is Not Positive");
        }

    }
}