package multiDeminsionalArray;

public class forEachLoopForTwoArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6};

       for( int ele : arr){
           System.out.print(ele + " ");
       }
        System.out.println();

       int[][] b = {{1,2,3},{4,5,6}};

       for ( int[] ele : b){
           for (int x : ele){
               System.out.print(x + " ");
           }
       }

    }
}
