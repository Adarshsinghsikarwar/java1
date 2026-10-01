package pattern_printing.triangle;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


//        for ( int i = 1; i <= n; i++){ //rows
//            for ( int j = 1; j <= i; j++){ //cols
//                System.out.print((2*j-1)+" ");
//            }
//            System.out.println();
//        }

//        for ( int i = 1; i <= n; i++){ // rows
//            int nextTerm = 1;
//            for ( int j = 1; j <= i; j++){ // cols
//                System.out.print(nextTerm+" ");
//                nextTerm +=2;
//            }
//            System.out.println();
//        }
        for ( int i = 1; i <= n; i++){

            for ( int j = 1; j <= (2*i-1); j+=2){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
