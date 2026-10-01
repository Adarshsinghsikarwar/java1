package StackInJava;

import java.util.Stack;

public class reverseStackByRecursive {
    public static void displayReverse(Stack<Integer> st){
        if (st.isEmpty()) return;
        int top = st.pop();
//        System.out.println(top); reverse order of the stack
        displayReverse(st);
//        System.out.println(top); original form of the stack
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        displayReverse(st);
    }
}
