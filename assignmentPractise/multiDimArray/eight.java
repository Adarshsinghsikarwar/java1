package assignmentPractise.multiDimArray;

public class eight {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,1},{4,5,6,1},{7,8,9,1},{2,3,4,5}};
        int m = arr.length;
        int n = arr[0].length;

        for ( int i = 0; i < m; i++){
            for ( int j = 0; j < n; j++){
                if ((i+j) % 2 == 0 ){
                    System.out.print(arr[i][j] + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
