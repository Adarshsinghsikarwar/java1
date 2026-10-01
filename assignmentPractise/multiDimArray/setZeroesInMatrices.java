package assignmentPractise.multiDimArray;

public class setZeroesInMatrices {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = arr.length;
        int n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;

        for ( int i = 0; i < m; i++){
            if (arr[i][0] == 0) {
                zeroCol = true;
                break;
            }
        }
        for ( int j = 0; j < n; j++){
            if (arr[0][j] == 0){
                zeroRow = true;
                break;
            }
        }

        for ( int i = 1; i < m ; i++){
            for ( int j = 1; j < n; j++){
                if (arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++){
            if (arr[0][j] == 0){
                for ( int i = 0; i < m; i++){
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++){
            if (arr[i][0] == 0){
                for ( int j = 0; j < m; j++){
                    arr[i][j] = 0;
                }
            }
        }
       if (zeroRow == true){
           for ( int j = 0; j < n; j++){
              arr[0][j] = 0;
           }
       }
        if (zeroCol == true){
            for ( int i = 0; i < m; i++){
                arr[i][0] = 0;
            }
        }

        for(int i =0; i < m; i++){
            for ( int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
