package assignmentPractise.patternPractise;

import java.util.Scanner;

public class sixPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for ( int i = 1; i<=2*n+2 ; i++ ){
            System.out.print("*" + " ");
        }
        System.out.println();
        for ( int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for ( int i = 1; i <= 2*n+2 ; i++){
            System.out.print("*" + " ");
        }

    }
}
