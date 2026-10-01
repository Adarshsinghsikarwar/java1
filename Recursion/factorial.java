package Recursion;

import java.util.Scanner;

public class factorial {
    public static long fact(long n){
        if (n == 1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long n = sc.nextLong();
        System.out.println(fact(n));
    }
}
