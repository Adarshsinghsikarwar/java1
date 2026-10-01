package assignmentPractise;

import java.util.Scanner;

public class sumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
//         int sum =0;
//        for ( int i=0; i<=n; i++){
//            sum +=i;
//        }
//        System.out.println("Sum of natural Number is: "+sum);

        int sum = n*(n+1)/2;
        System.out.println("Sum of natural Number is: "+sum);
    }
}
