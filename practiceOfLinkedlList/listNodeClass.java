package practiceOfLinkedlList;


class Node {
    int val;
    Node next;
    Node(int x){
        this.val = x;
    }

}

class SLL{
    Node head;
    Node tail;
    int size;

    public void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }
    public void insert(int val , int idx) throws Error{
        if(idx == 1) {
            insertAtHead(val);
            return;
        }
        else if(idx == size) {
            insertAtTail(val);
            return;
        }
        else if(idx < 1 && idx > size){
            throw new Error("It is out of the bound index");
        }
        else {
            Node nd = new Node(val);
            Node temp = head;
            for(int i = 2; i < idx; i++){
                temp = temp.next;
            }
            Node temp1 = temp.next;
            temp.next = nd;
            nd.next = temp1;
        }
        size++;
    }
    public void display(){
       Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void get(int idx){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else if(idx < 1 || idx > size){
            System.out.println("It is out of the bound index");
        }
        else {
            Node temp = head;
            for(int i = 1; i <= size; i++){
                if(idx == i){
                    System.out.println(temp.val);
                    return;
                }
                temp = temp.next;
            }
        }
    }
    public void set(int idx , int val){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        else if (idx < 1 || idx > size){
            System.out.println("This index is out of the bound");
        }
        else {
            Node temp = head;
            for(int i = 1; i <= size; i++){
                if(idx == i){
                    temp.val = val;
                }
                temp= temp.next;
            }
        }
    }
}
public class listNodeClass {
    public static void print(Node a){
        Node temp = a;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SLL node = new SLL();
        node.insertAtHead(4);
        node.insertAtHead(3);
        node.insertAtHead(2);
        node.insertAtHead(1);
        node.insert(7,0);

        node.display();
        node.set(3,3);
        node.display();

    }

}
