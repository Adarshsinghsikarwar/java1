package assignmentPractise.stringPractise;

public class seven {
    public static void main(String[] args) {
        String[] arr = {"272717","535","67272","76363","76272"};
        String maxS = arr[0];
        for ( int i = 0; i < arr.length; i++){
            maxS = max(arr[i],maxS);

        }
        String secondMax = "-1";
        System.out.println(maxS);
        for ( int i = 1; i < arr.length; i++){
            if (arr[i] != maxS) secondMax = max(arr[i],secondMax);
        }
        System.out.println(secondMax);
    }
    public static String max (String a , String b){
        String s = purify(a) , t = purify(b);
        if (s.length() > t.length()) return a;
        if (s.length() < t.length()) return b;
        for ( int i = 0; i < s.length(); i++){
            if (s.charAt(i) != t.charAt(i)){
                if (s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if (a.length() >= b.length()) return a;
        else return b;
    }
    public static String purify (String s){
        for ( int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '0') return s.substring(i);
        }
        return s;
    }
}
