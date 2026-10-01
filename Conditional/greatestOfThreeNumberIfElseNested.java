package Conditional;

import java.util.Scanner;

public class greatestOfThreeNumberIfElseNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first Number : ");
        int a = sc.nextInt();

        System.out.println("Enter a second Number : ");
        int b = sc .nextInt();

        System.out.println("Enter a third Number : ");
        int c = sc.nextInt();

        if (a > b){
            if (a > c) System.out.println(a+ "greatest Number ");
            else System.out.println(c+ "greatest Number");
        }
        else{
            if(b > c) System.out.println(b+ "greatest Number");
            else System.out.println(c+ "greatest Number ");

        }
    }
}
