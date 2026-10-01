package assignmentPractise.recursion;

import java.util.Scanner;

public class one {
    public static int  printSumOfOddNumber(int a , int b , int sum){
         if (a > b) return sum;

         if (a % 2 != 0) sum += a;

         return printSumOfOddNumber(a+1 , b , sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(printSumOfOddNumber(a,b, 0));
    }
}
