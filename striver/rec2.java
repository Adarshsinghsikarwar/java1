package striver;

public class rec2 {
    public static void printName(int n){
        if(n == 0) return;
        System.out.println("Adarsh Singh sikarwar");
        printName(n-1);
    }
    public static void main(String[] args) {
        printName(4);
    }
}
