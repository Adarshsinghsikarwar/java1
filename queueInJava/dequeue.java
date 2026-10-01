package queueInJava;
import java.util.*;
class Nodes{
    int data;
    Nodes prev,next;


    Nodes(int data){
        this.data = data;
        this.next = this.prev = null;
    }
}
class Deque{
    Nodes front;
    Nodes rear;
    int size;
    Deque(){
        front = rear = null;
        size = 0;

    }
    boolean isEmpty(){
        if (size== 0) return true;
        else return false;
    }

    int size(){
        return size;
    }
    void insertFront(int data){
        Nodes newNode = new Nodes(data);
        if (front == null){
            rear = front = newNode;
        }
       else {
           newNode.next = front;
           front.prev = newNode;
           front = newNode;
        }
        size++;
    }
    void insertRear(int data){
        Nodes newNode = new Nodes(data);
        if (rear == null)  rear = front = newNode;
        else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }
    void deleteFront(){
        if (size == 0) System.out.println(
                "UnderFlow"
        );
        else {
            Nodes temp = front;
            front = front.next;
            if (front == null)
                rear = null;
            else
                front.prev = null;
        }
        size--;
    }
    void deleteRear(){
        if (size == 0) System.out.println("Queue is underflow ");
        else{
            Nodes temp = rear;
            rear = rear.prev;
            if (rear == null){
                front = null;
            }
            else {
                rear.next = null;
            }
        }
        size--;
    }
    int getFront(){
        if (size == 0){
            System.out.println("Underflow");
            return -1;
        }
        return front.data;
    }
    int getRear(){
        if (size == 0){
            System.out.println("UnderFlow");
            return -1;
        }
        return rear.data;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        Nodes temp = front;
        System.out.print("Deque elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class dequeue {
    public static void main(String[] args) {
        Deque dq = new Deque();
        System.out.println("Inserting 5 at rear end : ");
        dq.insertRear(3);
        System.out.println("Inserting 10 at rear end : ");

        dq.insertRear(10);
        dq.deleteRear();
        dq.display();





    }
}