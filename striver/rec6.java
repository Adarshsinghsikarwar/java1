package striver;

import java.util.HashMap;

public class rec6 {
    public static void fact(int n , int factorial){
        if(n == 1){
            System.out.println("The factorial of n number is : " + factorial);
            return;
        }
        factorial *= n;
        fact(n-1 , factorial);
    }
    public static void main(String[] args) {
        HashMap<Integer , Integer> ans = new HashMap<>();
        ans.ke
        fact(4 , 1);
    }
}


