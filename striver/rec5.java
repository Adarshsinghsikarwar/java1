package striver;

public class rec5 {
    public static void sumOfNumber(int n , int sum ){
        if(n < 1){
            System.out.println("Sum of N  number : " + sum);
            return;
        }
        sum += n;
        sumOfNumber(n-1 , sum);

    }
    public static void main(String[] args) {
        sumOfNumber(5,0);
    }
}
