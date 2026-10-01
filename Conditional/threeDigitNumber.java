package Conditional;

import java.util.Scanner;

public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number is : ");
        int x = sc.nextInt();
        if (x > 99 && x < 1000)
            System.out.println("Three digit number ");
        else
            System.out.println("not three digit number ");
    }
}
