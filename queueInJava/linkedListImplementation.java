package queueInJava;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class queueLL{
    Node head = null;
    Node tail = null;
    int size = 0;

    public void add(int x){
        Node temp = new Node(x);
        if (size == 0){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public int peek(){
        if (size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.val;
    }
    public int remove(){
        if (size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    public boolean isEmpty (){
        if (size == 0) return true;
        return false;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class linkedListImplementation {
    public static void main(String[] args) {
       queueLL q = new queueLL();
       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       q.add(50);
       q.display();
    }
}
