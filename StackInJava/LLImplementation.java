package StackInJava;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class stack{
    Node head = null;
    int size = 0;

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int size(){
        return size;
    }
    int pop(){
        if (head == null){
            System.out.println("Stack is empty");
            return  -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    int peek(){
        if (head == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int x = head.val;
        return x;
    }
    boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }
    void display(){
        displayRec(head);
    }
    void displayRec(Node h){
        if (h == null) return;
        displayRec(h.next);
        System.out.println(h.val);
    }
}
public class LLImplementation {
    public static void main(String[] args) {

    }
}
