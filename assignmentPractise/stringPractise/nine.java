package assignmentPractise.stringPractise;

import java.util.Arrays;

public class nine {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagarm";
        char[] m = s.toCharArray();
        char[] n = t.toCharArray();
        Arrays.sort(m);
        Arrays.sort(n);
        System.out.println(m);
        System.out.println(n);
        boolean flag = false;
        for ( int i = 0; i < m.length ; i++){
            if (m[i] == n[i]) flag = true;
        }
        if (flag == true){
            System.out.println("anagram");
        }
        else {
            System.out.println("not");
        }
    }
}
