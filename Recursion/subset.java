package Recursion;

import java.util.ArrayList;

public class subset {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubset(int i , String s , String ans){
        if (i == s.length()){
//            System.out.println(ans);
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubset(i+1 , s, ans+ch);
        printSubset(i +1, s ,ans);
    }
    public static void main(String[] args) {
        String s = "abcd";
        printSubset(0, s, " ");

    }
}
