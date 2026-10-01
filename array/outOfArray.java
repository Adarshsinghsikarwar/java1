package array;

import java.util.Scanner;

public class outOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input in array
        for ( int i = 0 ; i <= n;i++){
            arr[i] = sc.nextInt();
        }
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
        // output of array by loop
        for ( int i = 0 ; i <=n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
