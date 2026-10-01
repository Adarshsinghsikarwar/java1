package array;
import java.util.ArrayList;
public class basicOfArrayList {

    public static void main(String[] args) {
//        int[] arr = new int[6];
//        double[] brr = new double[9];

       ArrayList<Integer> arr = new ArrayList<>(6);
       arr.add(0,10);
       arr.add(1,20);
       arr.add(2,30);
       arr.add(3,40);
       arr.add(4,50);
       arr.add(5,60);

        System.out.println(arr);
       for(int i = 0 ; i < arr.size(); i++){
           System.out.print(arr.get(i) + " ");
       }
        System.out.println();
       arr.set(2,70); // modify & update
        for(int i = 0 ; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        arr.add(90); //push back
        System.out.println();
        for(int i = 0 ; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }



    }
}
