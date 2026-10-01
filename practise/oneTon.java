package practise;

public class oneTon {
    public static int printSum(int n){
        if (n==1 || n==0) return 1;
        int ans = n + printSum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println( printSum(0));
    }
}
