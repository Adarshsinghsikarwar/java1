package sorting;

public class checkIfArraySortOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,7,9};
        boolean flag = true;
        for ( int i = 0; i < arr.length-1; i++){
            if (arr[i+1] < arr[i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
