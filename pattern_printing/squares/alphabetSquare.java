package pattern_printing.squares;

import java.util.Scanner;

public class alphabetSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row & cols : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

//        for ( int i = 1; i <= n; i++){
//            for ( int j = 1; j <= n; j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
        for ( int i = 1; i <= n; i++){
            for ( int j = 1; j <= n; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
