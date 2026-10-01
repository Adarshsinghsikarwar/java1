package assignmentPractise;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc .nextInt();

        System.out.println("Enter a second number : ");
        int b = sc.nextInt();


        int i=1;
        int  greatestFactor = 1;
        while ( (i <= a) || (i <= b) ){

            if ( (a%i == 0) && (b%i == 0)) {
                if (i > i - 1) greatestFactor = i;
            }
            i++;
        }
        if (a==0 && b==0) {
            greatestFactor =0;
        }
        System.out.println(greatestFactor);
    }
}
