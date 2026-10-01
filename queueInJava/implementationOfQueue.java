package queueInJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class implementationOfQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        Queue<Integer> queue = new LinkedList<>();

        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        que.remove();
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());

    }
}
