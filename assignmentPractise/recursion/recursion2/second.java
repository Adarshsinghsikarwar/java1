package assignmentPractise.recursion.recursion2;

public class second {
    public static void printIndex(int[] arr , int n){
        if (n < 0) return;
        printIndex(arr,n-1);
        System.out.print(n);

    }
    public static void main(String[] args) {
        int[] arr = {};
        int n = arr.length - 1;
        if (n==-1) System.out.print(-1);
        printIndex(arr, n);
    }
}
