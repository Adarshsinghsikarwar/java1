package StackInJava;

import java.util.Stack;

public class storeSameElementIntoAnotherStack {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);

        Stack<Integer> st_reverse = new Stack<>();
        while (st_original.isEmpty()){
            st_reverse.push(st_original.pop());
        }
        Stack<Integer> st_final = new Stack<>();
        while (st_reverse.isEmpty()){
           st_final.push(st_reverse.pop());
        }
        System.out.println(st_final);
    }
}
