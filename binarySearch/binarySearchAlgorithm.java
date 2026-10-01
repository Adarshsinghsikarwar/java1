package binarySearch;

public class binarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12,15,17,22,30,34,37,43};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int target = 34;

        while (low <= high ){
            int mid = (low + high) / 2;

            if ( arr[mid] < target) low = mid+1;
            else if (arr[mid] > target) high = mid -1;
            else if (arr[mid] == target) {
                System.out.print(mid);
                break;
            }
        }

    }
}
