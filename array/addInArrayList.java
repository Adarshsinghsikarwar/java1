package array;

import java.util.ArrayList;

public class addInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list +" "+list.size());
        list.add(200);
        System.out.println(list +" "+list.size());
        list.add(60);
        System.out.println(list +" "+list.size());
        list.add(80);
        System.out.println(list +" "+list.size());
        list.add(20);
        System.out.println(list +" "+list.size());
        list.remove(2);
        System.out.println(list +" "+list.size());
        System.out.println(list.get(1));
    }
}
