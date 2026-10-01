package string;

public class vowelInString {
    public static void main(String[] args) {
        String str = "Raghav Garg is a teacher";
        int count = 0;
        for ( int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||str.charAt(i) == 'e' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'E'){
                count++;
            }
        }
        System.out.println(count);
    }
}
