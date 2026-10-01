package array;

import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {20,12,35,56,45,67};
//        int[] arr = {1,1,1,1,1,1};
        int max = arr[0];
        int n = arr.length;
        for ( int i = 1; i < n; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);

    }
}
