package string;

public class passingStringInFunction {
    public static void main(String[] args) {
        String str = "Adarsh";
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
    public static void change( String a ){
        a = "Amit";
    }
}
