package practise;

import java.util.Scanner;

public class pow {
    public static int pow(int a , int b){
        if (b == 0) return 1;
        int ans = a * pow(a , b-1);
        return ans;
    }
    public static int pow2(int a , int b){
        if (b==0) return 1;
        int ans = pow2(a , b/2);
        if (b%2 == 0) return ans * ans;
        else return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of  b : ");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
        System.out.println(pow2(a,b));
    }
}
