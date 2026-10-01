package queueInJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        Stack<Integer> st = new Stack<>();
        int n = q.size() - k;

        while (k-- > 0){
            int a = q.peek();
            q.poll();
            st.push(a);
        }
        while (!st.isEmpty()){
            int a = st.peek();
            st.pop();
            q.add(a);
        }
        for (int i = 0; i < n; i++){
            int a = q.peek();
            q.poll();
            q.add(a);
        }
        System.out.println(q);

    }
}
