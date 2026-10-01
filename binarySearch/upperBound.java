package binarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int upperBound = n;
        int low = 0;
        int high = n-1;
        int target = 40;

        while ( low <= high ){
            int mid = low + (high -low) / 2;
            if (arr[mid] > target){
                upperBound = mid;
                high = mid -1;

            }
            else low = mid + 1;
        }
        System.out.println(upperBound);
    }
}
