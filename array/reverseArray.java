package array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
         int i = 0;
         int j = arr.length -1;


         while(i <= j){

             
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;
         }
//         for (int k = 0 ; k < arr.length/2; k++){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//      }
//        for (int i = 0 ; i < arr.length/2; i++){
//             int temp = arr[i];
//             arr[i] = arr[n-1-i];
//             arr[n-1-i] = temp;
//
//         }

         for ( int k = 0 ; k <arr.length; k++){
             System.out.print(arr[k] + " ");
         }

    }
}
