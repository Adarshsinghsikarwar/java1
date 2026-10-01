package assignmentPractise;

import java.util.Scanner;

public class absoluteValueByMathAbs {

    static void absoluteValue( int x ){
        System.out.println(Math.abs(x));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        absoluteValue(n);

    }
}
