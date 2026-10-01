package string;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder();
        System.out.println(x.length());
        System.out.println(x.capacity());

        StringBuilder a = new StringBuilder(2);
        System.out.println(a.length());
        System.out.println(a.capacity());
    }
}
