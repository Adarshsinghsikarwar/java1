package pattern_printing.squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****"); // not do in this way
//        System.out.println("*****");
//        System.out.println("*****");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & cols : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <=n; i++){
            for ( int j = 1; j <=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
