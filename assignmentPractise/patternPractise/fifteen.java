package assignmentPractise.patternPractise;

import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for ( int i = 1; i <= 2*n+1; i++){
            System.out.print((char) (i+64) + " ");
        }
        System.out.println();
        for ( int i = 1; i <= n ; i++){
            int a= 1;
            for( int j = 1; j <= n-i+1; j++){
                System.out.print((char) (a+64) + " ");
                a++;
            }
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print(" " + " ");
                a++;
            }
            for ( int j = 1; j <= n-i+1; j++){
                System.out.print((char) (a+64) + " ");
                a++;
            }
            System.out.println();
        }
    }
}
