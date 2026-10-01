package striver;

public class rec1 {
    public static void print(int n){
        if(n==0) return;
        System.out.println("Hello");
        print(n-1);
    }
    public static void main(String[] args) {
      print(4);
    }
}
