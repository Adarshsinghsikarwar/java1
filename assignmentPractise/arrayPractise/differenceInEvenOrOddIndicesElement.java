package assignmentPractise.arrayPractise;

public class differenceInEvenOrOddIndicesElement {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7};
        int n = arr.length;
        int sumOfEvenIndices = 0;
        int sumOfOddIndices = 0;

        for ( int i = 0 ; i < n; i++){
            if (i%2 == 0){
                sumOfEvenIndices +=arr[i];
            }
            else {
                sumOfOddIndices += arr[i];
            }
        }
        System.out.println(Math.abs(sumOfEvenIndices-sumOfOddIndices));
    }
}
