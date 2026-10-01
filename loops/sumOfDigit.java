package loops;

import java.util.Scanner;

public class sumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number : ");
        int n = sc .nextInt();

        int last = 0;
        int sum = 0;

        while(n!=0){
             last= n %10;
             sum +=last;
             n /=10;
        }
        System.out.println("sum of the number is : "+ sum);
    }
}
