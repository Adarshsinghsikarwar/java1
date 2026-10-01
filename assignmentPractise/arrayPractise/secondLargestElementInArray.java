package assignmentPractise.arrayPractise;

public class secondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {12,11,30,40};
        int n = arr.length;

        int Max = Integer.MIN_VALUE;;
        int secondMax = Integer.MIN_VALUE;
        for ( int i = 0; i < n; i++){
            Max =  Math.max(arr[i],Max);
        }
        for ( int j = 0; j < n ; j++){
            if (arr[j] > secondMax && arr[j] != Max) {
                secondMax = Math.max(arr[j],secondMax);
            }
        }
        System.out.println(Max);
        System.out.println(secondMax);
    }
}
