package array;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {40,20,10,50,30};
        for( int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

//        int[] nums = arr; // shallow copy
//        for( int ele : nums){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        nums[0] = 100;
//        System.out.println(arr[0]);

        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] =70;
        System.out.println(arr[0]);

        int[] crr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            crr[i] = arr[i];
    }
        for( int i : crr){
            System.out.print(i + " ");
        }
    }



}
