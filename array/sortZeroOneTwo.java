package array;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
//        int noOfZeroes = 0,noOfOne = 0;
//
//        for ( int i = 0 ; i < n; i++){
//            if (arr[i] == 0) noOfZeroes++;
//            if (arr[i] == 1) noOfOne++;
//        }                                       -----> method One for this problem
//        for ( int i = 0 ;i < n; i++){
//            if (i < noOfZeroes) arr[i] = 0;
//            else if (i < noOfZeroes + noOfOne) arr[i] = 1;
//            else arr[i] = 2;
//        }

        int low = 0, high= n-1,mid = 0;

        while(mid <= high){
            if (arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low]= temp;
                low++;
                mid++;
            }
            else if ( arr[mid] == 1) mid++;
            else { // mid == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for ( int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
