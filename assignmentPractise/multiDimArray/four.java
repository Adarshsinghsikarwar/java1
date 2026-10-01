package assignmentPractise.multiDimArray;

public class four {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4,6},{2,4,5,7},{3,5,6,8},{4,6,7,9}};
        int m = arr.length;
        int n = arr[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++){
            for ( int j = 0; j < n; j++){
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
