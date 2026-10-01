package array;

public class basicOfSyntax {
    public static void main(String[] args) {
        int[] arr = new int[3]; //Declaration and memory allocation
        arr[0] = 1; // initialising the array index
        arr[1] = 2;
        arr[2] = 3;
        //output of the array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //update the value of the array
        arr[0] =99;
        System.out.println(arr[0]);
    }
}
