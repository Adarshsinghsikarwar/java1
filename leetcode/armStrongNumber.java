package leetcode;

public class armStrongNumber {
    public static void main(String[] args) {
        int n = 123;
        int copy = n;
        int reverse = 0;

        while ( n != 0 ){
            int lastDigit = n %10;
            lastDigit = lastDigit * lastDigit * lastDigit;
            n /= 10;
            reverse += lastDigit;
        }
        if (reverse == copy) System.out.println("this number is armstrong");
        else System.out.println("it is not armstrong");
    }
}
