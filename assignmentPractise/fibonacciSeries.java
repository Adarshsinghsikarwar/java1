package assignmentPractise;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc . nextInt();

        int a = 0 , b = 1;
        for (int i=0; i <= n-1; i++){
            System.out.print(a+" ");
            int  nexTerm = a+b;
            a = b;
            b = nexTerm;
        }
        sc.close();
    }
}
