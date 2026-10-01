package linked_List;

class dNode {
    int val;
    dNode next;
    dNode prev;

    dNode( int val){
        this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if (size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if (size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
    }
    void insert(int idx , int val){
        if (idx == 0){
            insertAtHead(val);
            return;
        }
        if (idx == size){
            insertAtTail(val);
            return;
        }
        if (idx > size || idx < 0){
            System.out.println("Invalid index");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for (int i = 1; i <= idx -1; i++){
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp ; temp.prev = x;
        y.prev = temp ; temp.next = y;
        size++;
    }
    void deleteAtHead(){
        if (head == null){
            System.out.println("Invalid index");
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail(){
        if(tail == null){
            System.out.println("Invalid index ");
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
}

public class doublyLinkedListInJava {
    public static void print (dNode head){
        dNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse (dNode tail){
        dNode temp = tail;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display (dNode node){
        dNode temp = node;
        while (temp.prev != null){
            temp = temp.prev;
        }
        print(temp);
    }
    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
//        print(a);
//        printReverse(d);
//        display(c);
        DLL list = new DLL();
        list.display();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insert(2,80);
        list.display();
    }
}
