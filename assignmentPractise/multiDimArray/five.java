package assignmentPractise.multiDimArray;

public class five {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++){
            int totalSum = 0;
            for ( int j = 0; j < n; j++){
                totalSum += arr[i][j];
            }
            sum = Math.max(totalSum,sum);
        }
        System.out.println("Maximum sum : " + sum);
    }
}
