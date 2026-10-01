package assignmentPractise.arrayPractise;

public class productOfAllElementOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int n = arr.length;
        int product = 1;
        for ( int i = 0; i < n; i++){
            product *= arr[i];
        }
        System.out.println();
        System.out.print("The product of the array Element is : "+ product + " ");

    }
}
