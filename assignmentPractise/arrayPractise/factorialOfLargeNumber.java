package assignmentPractise.arrayPractise;

public class factorialOfLargeNumber {
    public static void main(String[] args) {
        int[] arr ={ 1,2 ,3,4,5};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for( int i = 0; i < n ; i++){
            max = Math.max(arr[i],max);
        }
        System.out.print(max + " ");
        System.out.println();
        int factorial = 1;
       while ( max > 0){
           factorial *= max;
           max--;
       }
        System.out.print(factorial);
       
    }
}
