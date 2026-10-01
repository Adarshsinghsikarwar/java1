package queueInJava;

import java.util.LinkedList;
import java.util.Queue;

public class removeElementAtEvenIndexInQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> newQue = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        while (!que.isEmpty()){
            que.poll();
            if(!que.isEmpty()){
                newQue.add(que.remove());
            }
        }
        que = newQue;
        System.out.println(que);
    }
}
