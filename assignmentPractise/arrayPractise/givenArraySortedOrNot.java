package assignmentPractise.arrayPractise;

public class givenArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {3,4,11,13,14,15,20};
        int n = arr.length;
        int flag = 1;
//        System.out.println(arraySortedOrNot(arr));

        for ( int i = 0 ; i < n-1; i++){
            if ( arr[i] > arr[i+1]){
                flag = 0;
            }
            else {
                flag = 1;
            }
    }
        System.out.println(flag);

//    public static boolean arraySortedOrNot(int[] arr) {
//        for ( int i = 0; i < arr.length-1; i++){
//            if ( arr[i] > arr[i+1]) return false;
//        }
//        return true;
    }
}
