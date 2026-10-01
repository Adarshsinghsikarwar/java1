package assignmentPractise;

import java.util.Scanner;

public class stringPalindromeOrNot {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
       int i=0;
       int j= str.length() - 1;
       int signal =0;
       while(i < j){
           if (str.charAt(i) != str.charAt(j)){
               System.out.println("string is not a palindrome");
               signal =1;
               break;
           }

           i++;
           j--;
       }
       if (signal == 0)  System.out.println("string is palindrome");
    }
}
