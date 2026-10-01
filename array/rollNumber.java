package array;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {40,50,12,34,60,70,100,30};
        int n = arr.length;
        System.out.println("Length of the array : " + n);
        for ( int i = 0 ; i < n ; i++){
            if (arr[i] < 35) System.out.print(i + " ");
        }
    }
}
