package assignmentPractise.sortingPractise;

public class minimumPossibleSumOfTwoNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int sum = Integer.MAX_VALUE;
        for ( int i = 0; i < n-1; i++){
            for ( int j = i+1 ; j < n;i++){
                sum = Math.min(sum,arr[i] + arr[j]);
            }
        }
        System.out.println(sum);
    }
}
