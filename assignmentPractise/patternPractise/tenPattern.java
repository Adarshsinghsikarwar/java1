package assignmentPractise.patternPractise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tenPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for ( int i = 1; i <= n; i++){
            int a = i;
            for ( int j =1 ; j <= i; j++){
                System.out.print((a-j+1) + " ");
                a++;

            }
            System.out.println(" " + " ");
        }
    }
}
