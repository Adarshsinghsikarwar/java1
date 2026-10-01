package assignmentPractise.stringPractise;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder tb = new StringBuilder(sc.nextLine());

        int n = sb.length();

        int i = 0;
        int j = n - 1;
        while (i < j){
            char temp = sb.charAt(i);
           sb.setCharAt(i,sb.charAt(j));
           sb.setCharAt(j,temp);
           i++;
           j--;
        }

        sb.append(tb);
        System.out.println(sb);

    }
}
