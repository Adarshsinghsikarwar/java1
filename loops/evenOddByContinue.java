package loops;

import java.util.Scanner;

public class evenOddByContinue {

    public static void main(String[] args) {

        // 100 rounds
//        for (int i=0 ; i <= 100; i++){
//            if (i%2==0) System.out.println(i);
//        }

        // 50 rounds
//        for (int i= 0 ; i <=100; i+=2){
//            System.out.println(i);
//        }


         //100 rounds
        for (int i=0 ; i <= 100; i++){
            if (i%2==0) continue;

            System.out.println(i);
        }
    }
}
