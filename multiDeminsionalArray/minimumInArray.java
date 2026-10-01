package multiDeminsionalArray;

public class minimumInArray {
    public static void main(String[] args) {
        int[][] arr = {{9,1,2,-1},{7,8,-5,2}};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                min = Math.min(min,arr[i][j]);
            }
        }
        System.out.println(min);
    }
}
