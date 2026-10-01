package practise;

import java.util.Scanner;

public class mazePath {
    public static int maze(int row , int col , int m , int n ){
        if (m == row || n == col) return 1;
        int right = maze(row,col+1,m,n);
        int down = maze(row +1 , col , m ,n);
        return right + down;
    }
    public static int maze2 (int row , int col){
        if (row == 1 || col == 1) return 1;
        int right = maze2(row , col-1);
        int down = maze2(row -1, col);
        return right + down;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of m : ");
        int m = sc.nextInt();
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
