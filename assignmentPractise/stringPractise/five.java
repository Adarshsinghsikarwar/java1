package assignmentPractise.stringPractise;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int result = 0;
        for ( int i = 0; i < sb.length(); i++){
            int ascii = (int)sb.charAt(i);
            if ((ascii >= 65 && ascii <= 90) ||ascii >= 97 && ascii <= 122){
              result = result * 10 + ascii;
            }
            
        }
        System.out.println(result);

    }
}
