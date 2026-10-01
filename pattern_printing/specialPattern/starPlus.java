package pattern_printing.specialPattern;

import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for( int i = 1; i <= n; i++){
            for ( int j = 1; j <= n; j++){
                if((n+1)/2==i || (n+1)/2==j){
                    System.out.print("*"+ " ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
