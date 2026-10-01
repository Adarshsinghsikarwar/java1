package assignmentPractise.multiDimArray;

public class six {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};
        int m = arr.length;
        int n = arr[0].length;
        int rowMid = m / 2;
        int colMid = n / 2;

        for(int i = 0; i < m; i++){
            for ( int j = 0; j < n; j++){
                if (i == rowMid){
                    System.out.print(arr[i][j]+" ");
                }
                else if ( j == colMid){
                    System.out.print(arr[i][j]+ " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
