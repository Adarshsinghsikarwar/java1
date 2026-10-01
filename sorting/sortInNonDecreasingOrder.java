package sorting;

public class sortInNonDecreasingOrder {
    public static void print( int[] arr){
        for( int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        print(arr);
        for ( int i = 0; i < n; i++){
            boolean flag = true;
            for ( int j = 0; j < n-1-i; j++){
                if (arr[j+1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag == true) break;
        }
        print(arr);
    }
}
