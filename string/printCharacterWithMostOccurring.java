package string;

public class printCharacterWithMostOccurring {
    public static void main(String[] args) {
        String str = "abaaacrmnrra";
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++){
            int ascii = (int) str.charAt(i);
            arr[ascii-97]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        int id = 0;
       for ( int i = 0; i < arr.length; i++){
           if (arr[i] == max){
                char ch = (char)(i+97);
               System.out.print(ch + " ");
           }
       }


    }
}
