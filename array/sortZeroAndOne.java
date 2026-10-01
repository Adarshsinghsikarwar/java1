package array;

public class sortZeroAndOne {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,0,1,1,0,1,0};
        int n = arr.length;
//        int noOfZeroes = 0;
//
//        for ( int i = 0; i < n; i++){
//            if(arr[i] == 0) noOfZeroes ++;
//
//        }
//        for (int i = 0; i < n; i++){
//            if (i < noOfZeroes) arr[i] = 0;   -----> Method One 2Pass solution
//            else arr[i] = 1;
//        }
//       for ( int i = 0; i < n; i++){
//           System.out.print(arr[i] + " ");
//       }

        int i = 0;
        int j = n-1;

        while( i < j ){
            if ( arr[i] == 0) i++;
            if ( arr[j] == 1) j--;
            if (arr[i] == 1 && arr[j] == 0) {
               arr[i] = 0;
               arr[j] = 1;
               i++;
               j--;
            }
        }
        for( int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
