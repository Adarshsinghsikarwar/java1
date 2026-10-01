package sorting;

public class maximumAtRightPositionBysorting {
    public static void print( int[] arr){
        for( int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);
        for ( int i = n-1; i >= 0; i--){
            int max = Integer.MIN_VALUE;
            int maxIdx = 0;
            for ( int j = i ; j >= 0; j--){
                if (arr[j] > max){
                    max = arr[j];
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
       print(arr);

    }
}
