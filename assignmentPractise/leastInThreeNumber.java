package assignmentPractise;

import java.util.Scanner;

public class leastInThreeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a= sc.nextInt();

        System.out.print("Enter second number : ");
        int b= sc.nextInt();

        System.out.print("Enter third number : ");
        int c= sc.nextInt();



        if (a < b){
            if (a < c) System.out.println(a+" number is least number ");
            else System.out.println(c+ " number is least number ");
        }
        else{
            if (b < c) System.out.println(b+ " number is least number");
            else System.out.println(c+ " number is least number ");
        }


    }
}
