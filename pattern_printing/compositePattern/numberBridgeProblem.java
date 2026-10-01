package pattern_printing.compositePattern;

import javax.swing.*;
import java.util.Scanner;

public class numberBridgeProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for ( int i = 1; i <= 2*n-1; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        n--;
        for ( int i = 1; i <= n; i++){
            int a = 1;
            for ( int j = 1; j <= n-i+1; j++){
                System.out.print(a + " ");
                a++;
            }
            for ( int j = 1; j <= 2*i-1; j++){
                System.out.print(" " + " ");
                a++;
            }
            for ( int j = 5; j <= n+5-i; j++ ){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
