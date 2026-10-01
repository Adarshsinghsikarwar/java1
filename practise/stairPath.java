package practise;

public class stairPath {
    public static int stairPaths(int n){
        if (n <= 2) return n;
        int ans = stairPaths(n-1) + stairPaths(n-2);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(stairPaths(5));
    }
}
