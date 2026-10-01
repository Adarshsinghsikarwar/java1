package array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Enter n : ");
        int i = sc .nextInt();
        i = i%n;

//        


        System.out.println();
       for (int k = 0; k < arr.length; k++) {
           System.out.print(arr[k] + " ");
       }
    }
}
