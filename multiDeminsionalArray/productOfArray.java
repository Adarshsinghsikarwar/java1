package multiDeminsionalArray;

public class productOfArray {
    public static void main(String[] args) {
        int[][] arr = {{9,1,2},{7,5,6}};
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                product *= arr[i][j];
            }
        }
        System.out.print(product);
    }
}
