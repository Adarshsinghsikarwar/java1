package assignmentPractise;

import java.util.Scanner;

public class correctNamingForvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a age of the person : ");
        byte age = sc.nextByte();
        System.out.println(age);

        System.out.print("Enter a average : ");
        float average = sc.nextFloat();
        System.out.println(average);

        System.out.print("Enter a Name : ");
        String Name = sc.nextLine();
        System.out.println(Name);

    }
}
