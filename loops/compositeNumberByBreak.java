package loops;

import java.util.Scanner;

public class compositeNumberByBreak {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int signal =0;

        for( int i=2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("composite  number ");
                signal = 1;
                break;
            }
        }
        if (signal==0) System.out.println("it is prime number ");

    }
}
