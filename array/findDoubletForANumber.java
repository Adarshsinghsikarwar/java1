package array;

import java.util.Scanner;

public class findDoubletForANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc .nextInt();
        int[] arr = {5,2,7,-1};
        for ( int i = 0; i < arr.length; i++){
            boolean flag = false;
            for ( int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == n) {
                    System.out.print(i + " " + j);
                    flag = true;
//                    break;
                }

            }
            if ( flag == true) break;
        }
    }
}
