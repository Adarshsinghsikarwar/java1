package assignmentPractise.stringPractise;

public class one {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] ch = str.toCharArray();

       for ( int i = 0; i < ch.length; i++){
           if (i % 2 != 0){
               ch[i] ='#';

           }
       }
        System.out.println(ch);
    }
}
