package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class builtMethod {
    public static void main(String[] args) {
        int[] arr = {40,20,10,50,30};
//        for(int i = 0 ; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
        // for Each loop
        for ( int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
