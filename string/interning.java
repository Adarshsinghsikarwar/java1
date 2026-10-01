package string;

public class interning {
    public static void main(String[] args) {
        String a = "Adarsh";
        String b = "Adarsh";

//        a.charAt(0) = 'a';  Error

        System.out.print(a + b);
        a = "Madhav";
        System.out.println(a);
    }
}
