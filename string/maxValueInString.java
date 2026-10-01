package string;



public class maxValueInString {
    public static void main(String[] args) {
        String[] arr = {"999","1098","123","0078"};
        String maxS = arr[0];

        for ( int i = 1; i < arr.length; i++){
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
    }
    public static String max ( String a , String b){
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

    public static String purify(String a){
        for ( int i = 0; i < a.length(); i++){
            if (a.charAt(i) != 0) return a.substring(i);
        }
        return a;
    }
}
