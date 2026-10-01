package assignmentPractise.stringPractise;

public class third {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("madam");
       StringBuilder str = sb;
       int n = sb.length();
       int i = 0;
       int j = n-1;

       while ( i < j){
           char temp = sb.charAt(i);
           sb.setCharAt(i, sb.charAt(j));
           sb.setCharAt(j,temp);
           i++;
           j--;
       }

       if (sb.equals(str)){
           System.out.println("palindrome");
       }
       else {
           System.out.println("Not palindrome");
       }
    }
}
