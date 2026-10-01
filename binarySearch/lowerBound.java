package binarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length;
        int lowerBound = n;
        int low = 0;
        int high = n-1;
        int target = 2;
        while (low <= high){
            int mid = (low +high) / 2;
            if (arr[mid] >= target){
                lowerBound = Math.min(mid, lowerBound);
                high = mid-1;
            }
            else low = mid + 1;
        }
        System.out.print(lowerBound);
    }
}
