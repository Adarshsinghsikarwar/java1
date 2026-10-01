package assignmentPractise.arrayPractise;

import java.util.Scanner;

public class countGreaterThanInputNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        int count = 0;
        for ( int i = 0; i < n; i++){
            if (arr[i] > x ) count ++;
        }
        System.out.print(count);
    }
}
