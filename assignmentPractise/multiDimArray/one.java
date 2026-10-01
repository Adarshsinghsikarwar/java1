package assignmentPractise.multiDimArray;

public class one {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int m = arr.length;
        int n = arr[0].length;

        for ( int i = 0; i < m ; i++){
            for ( int j = 0; j < n; j++){
                arr[i][j] = 10;
            }
        }
        for ( int i = 0; i < m ; i++){
            for( int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
