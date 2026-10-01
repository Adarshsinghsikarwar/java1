package assignmentPractise.arrayPractise;

public class largestThreeNumber {
    public static void main(String[] args) {
        int[] arr = {9,2,10,112,34,56,67};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for ( int i = 0; i < n; i++){
            max = Math.max(max,arr[i]);
        }

        for ( int i = 0; i < n; i++){
            if (arr[i] != max && arr[i] > secondMax){
                secondMax = Math.max(arr[i],secondMax);

            }
        }
        for ( int i = 0; i < n; i++){
            if (arr[i] != secondMax && arr[i] < secondMax ){
                thirdMax = Math.max(arr[i],thirdMax);
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(thirdMax);
    }
}
