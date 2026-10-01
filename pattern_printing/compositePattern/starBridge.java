package pattern_printing.compositePattern;

import java.util.Scanner;

public class starBridge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc .nextInt();

        for ( int i = 1; i <= 2*n-1; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        for(int k = 1; k < n; k++){
            for(int j = 1; j <=n-k; j++){
                System.out.print("*" + " ");
            }
            for( int j=1; j <= 2*k-1; j++){
                System.out.print(" " + " ");
            }
            for( int j = 1; j <= n-k; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}

