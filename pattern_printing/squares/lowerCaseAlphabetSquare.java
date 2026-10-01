package pattern_printing.squares;

import java.util.Scanner;

public class lowerCaseAlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols : ");
        int n = sc. nextInt();
        int m = sc.nextInt();

//        for ( int i = 1; i <= n; i++){
//            for (int j = 1; j <= m; j++){
//                System.out.print((char)(j+96)+" ");
//            }
//            System.out.println();
//        }
        for ( int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}
