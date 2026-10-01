package assignmentPractise;

import java.util.Scanner;

public class evenAndOddByFunction {
    static void evenOdd(int n){

        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        evenOdd(n);
    }
}
