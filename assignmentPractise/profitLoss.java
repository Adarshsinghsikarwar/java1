package assignmentPractise;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter costPrice : ");
        int costPrice = sc.nextInt();
        System.out.print("Enter sellingPrice : ");
        int sellingPrice = sc.nextInt();

        if (costPrice > sellingPrice) System.out.println("loss : " +(sellingPrice-costPrice));
        else if( costPrice < sellingPrice) System.out.println("profit : "+(sellingPrice - costPrice));
        else System.out.println("neither profit or loss");

    }
}
