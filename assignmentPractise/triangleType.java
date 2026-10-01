package assignmentPractise;

import java.util.Scanner;

public class triangleType {

    static void typeOfTriangle( int a ,int b ,int c){

        if ((a==b) && (a==c)) System.out.println("It is equilateral triangle");
        else if ( ((a==b) || (b==c) ||(c==a)) ) System.out.println( "it is isosceles triangle");
        else System.out.println("it is scalene triangle");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side : ");
        int a= sc.nextInt();
        System.out.print("Enter second side : ");
        int b= sc.nextInt();
        System.out.print("Enter third side : ");
        int c= sc.nextInt();

        typeOfTriangle(a,b,c);
    }
}
