package assignmentPractise.recursion.recursion2;

public class one {
    public static void print(int[] arr , int n){
        if (n < 0) return;
        System.out.print(arr[n]);
        print(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int n = arr.length-1;
        print(arr, n);
    }
}
