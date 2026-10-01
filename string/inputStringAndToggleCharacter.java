package string;

import java.util.Scanner;

public class inputStringAndToggleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

      for ( int i = 0 ;i < sb.length(); i++){
          int ascii = (int)sb.charAt(i);
          if (ascii < 91 && ascii >= 65){
              char ch = (char)(ascii + 32);
              sb.setCharAt(i,ch);
          }
          else if (ascii < 123 && ascii >= 97){
              char ch = (char)(ascii - 32);
              sb.setCharAt(i,ch);
          }

      }
        System.out.println(sb);
    }
}
