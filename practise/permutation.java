package practise;

public class permutation {
    public static void printPermutation(String ans, String s){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
            String right = s.substring(0,i);
            String left = s.substring(i+1);
            printPermutation(ans+ch,right+left);
        }
    }
    public static void main(String[] args) {
        String s = "abcd";
        printPermutation("",s);
    }
}
