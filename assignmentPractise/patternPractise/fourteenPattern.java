package assignmentPractise.patternPractise;

import java.util.Scanner;

public class fourteenPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n =  sc.nextInt();
        for( int i = 1; i <= n ; i++){
            for ( int j = 1; j <= n-i; j++){
                System.out.print("*" + " ");
            }
            for ( int j = 1; j <= i; j++){
                System.out.print((char) (i-j+1+64) + " ");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print((char) (j+65) + " ");
            }
            System.out.println();
        }
    }
}
