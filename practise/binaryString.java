package practise;

import java.util.Scanner;

public class binaryString {
    public static void print(String ans , int n ){
        int m = ans.length();
        if (m==n)
        {
            System.out.println(ans);
            return;
        }
        if (m == 0 || ans.charAt(m-1) == '0'){
            print(ans+0,n);
            print(ans+1,n);
        }
        else print(ans+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        print("",n);
    }
}
