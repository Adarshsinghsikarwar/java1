package Conditional;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost price  : ");
        int cp = sc.nextInt();

        System.out.print("Enter the Sell price  : ");
        int sp= sc.nextInt();

        if (cp < sp)
            System.out.println("Loss is : "+(sp-cp));
        if ( cp > sp)
            System.out.println("profit is : "+(cp-sp));
        if (cp == sp)
            System.out.println("no profit or Loss ");
    }
}
