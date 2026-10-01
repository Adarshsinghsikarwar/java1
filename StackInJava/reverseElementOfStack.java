package StackInJava;

import java.util.Stack;

public class reverseElementOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Stack<Integer> reverse = new Stack<>();

        while (st.size() > 0){
            int val = st.pop();
            reverse.push(val);
        }
        System.out.println(reverse);
    }
}
