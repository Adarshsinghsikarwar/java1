package array;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
//        int mx = Integer.MIN_VALUE; // inbuilt function in java

          int[] arr = {2,5,60,45,70,65,80};
          int n = arr.length;
          int mx = Integer.MIN_VALUE;
          for ( int i = 0; i < n ; i++){
              if( arr[i] > mx) mx = arr[i];

          }
          int secondMax = Integer.MIN_VALUE;
          for ( int i = 0 ; i < n ; i++){
//              if (arr[i] != mx ) secondMax = arr[i];
              if (arr[i] != mx ) secondMax = Math.max(arr[i],secondMax);
          }

        System.out.println(mx);
        System.out.println(secondMax);



    }
}
