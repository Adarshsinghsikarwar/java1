package assignmentPractise.patternPractise;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class fivePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for ( int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        n--;
        for ( int i = 1; i <= n; i++){
            for( int j = 1; j <= n-i+1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
