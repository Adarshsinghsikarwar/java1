package assignmentPractise.recursion;

import java.util.Scanner;

public class second {
    public static int climbStair(int n){
        if (n <= 3) return n;

        return climbStair(n-1) + climbStair(n-2) + climbStair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(climbStair(n));
    }
}
