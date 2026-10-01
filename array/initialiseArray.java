package array;

public class initialiseArray {
    public static void main(String[] args) {

        int[] arr = {10,2,3,4,5,6,7,8,9,1,2,3,-1,-2,3,9,0,-5};
        int n = arr.length;  // length function in array
        System.out.println(n);
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
