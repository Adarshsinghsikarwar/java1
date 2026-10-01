package assignmentPractise.recursion;

import java.util.Scanner;

public class third {
    public static boolean checkIsPowerOfTwo(int n ){
        if (n==1) return true;
        if (n % 2 != 0) return false;
        return checkIsPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(checkIsPowerOfTwo(n));
    }
}
