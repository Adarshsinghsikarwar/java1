package assignmentPractise;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a principal value: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate : ");
        float r= sc.nextFloat();

        System.out.print("Enter year : ");
        float y= sc.nextFloat();

        System.out.println("Simple interest : "+(p*r*y)/100);
    }
}
