package string;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class sortingOFString {
    public static void main(String[] args) {
        String s = "Adarsh";
        char[] ch = s.toCharArray();
        s.toCharArray();
        for (char ele : ch ){
            System.out.print(ele);
        }
        System.out.println();

      StringBuilder sb = new StringBuilder("Hello world");
      char[] br = sb.toString().toCharArray();
      Arrays.sort(br);
        System.out.println(br);
        String t = "Adarsh";
        char[] cr =t.toCharArray();
        System.out.println(Arrays.equals(ch,cr));

    }
}
