package assignmentPractise.multiDimArray;

public class seven {
    public static  class Main {
        public static void main(String[] args) {
            int[][] matrix = {{1, 1, 2, 2}, {1, 2, 2, 4}, {1, 2,
                    3, 4}, {1, 4, 1, 2}};
            int sum = 0;
            int col = matrix[0].length;
            for (int row = 0; row < 3; row++) {
                sum = sum + matrix[row][col];
            }
            System.out.println(sum);
        }
    }
}
