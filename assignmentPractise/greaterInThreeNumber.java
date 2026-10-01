package assignmentPractise;

import java.util.Scanner;

public class greaterInThreeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a= sc.nextInt();
        System.out.print("Enter second number : ");
        int b= sc.nextInt();
        System.out.print("Enter third number : ");
        int c= sc.nextInt();

        if ((a > b) && (a>c))   System.out.println("first number is greater than other ");

         else if ((b > a ) && (b > c)) System.out.println("second number is greater than other ");

         else if ((c > a) && (c > b) ) System.out.println("third number is greater than other ");

         else System.out.println("no number is greater ");
    }
}
