package linked_List;


class Node{
    int val;
    Node next;
    Node (int x){
        this.val = x;
    }
}
public class listNodeClass {

    public static void print (Node head){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayRecursive(Node head){
        if (head == null) return;
        System.out.println(head.val);
        displayRecursive(head.next);
    }
    public static void main(String[] args) {
      Node a = new Node(10);
        System.out.println(a.val);
        System.out.println(a.next);
      Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
//      print(a);
        displayRecursive(a);
      Node temp = a;
      for (int i = 1; i <= 5; i++){
          System.out.println(temp.val);
          temp = temp.next;
      }
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
        System.out.println(a.next.next.next.next.next.val);
    }
}
