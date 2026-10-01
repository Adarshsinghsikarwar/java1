package Recursion;

import java.util.Scanner;

public class sumOfNByRecursion {
//    public static int sumOfN (int n , int sum) {
//        if (n==0) return sum;
//        sum += n;
//        return sumOfN(n-1 , sum);
//    }
public static void sumOfN (int n , int sum) {
    if (n== 0) {
        System.out.println(sum);
        return;
    }
    sumOfN(n-1 ,sum+n);
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sumOfN(n,0);
    }
}
