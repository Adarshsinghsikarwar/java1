package array;

public class sumOfAllTheElementOfTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int sum = 0;
        for ( int i = 0; i < n ;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
