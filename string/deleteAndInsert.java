package string;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.delete(3,6);
        System.out.println(sb);
        sb.insert(2,'a');
        System.out.println(sb);
    }
}
