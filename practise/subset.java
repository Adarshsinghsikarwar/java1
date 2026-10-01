package practise;

import java.util.ArrayList;

public class subset {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubSet(int i , String s, String ans){
        if (i == s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubSet(i+1,s,ans+ch);
        printSubSet(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubSet(0,s,"");
        System.out.println(arr);
    }
}
