package linked_List;

class SLL{
  Node head;
  Node tail;
  int size;
  public void insertAtHead(int val){
      Node temp = new Node(val);
      if (head == null) head = tail = temp;
      else {
          temp.next = head;
          head = temp;
      }
      size++;
  }
  public void insertAtTail(int val){
      Node temp = new Node(val);
      if (head == null) head = tail = temp;
      else{
          tail.next = temp;
          tail = temp;
      }
      size++;
  }
  public void insert(int idx , int val){
      if (idx==0){
          insertAtHead(val);
          return;
      }
      if (idx == size){
          insertAtTail(val);
          return;
      }
      if (idx > size || idx < 0){
          System.out.println("Invalid index !!");
          return;
      }
      Node temp = new Node(val);
      Node x = head;
      for (int i = 1; i <= idx-1; i++){
          x = x.next;
      }
      temp.next = x.next;
      x.next = temp;
      size++;
  }
  public int get(int idx) throws Error{
      if (idx == size-1) return tail.val;
      if (idx >= size || idx < 0) {
          throw new Error("Invalid idx !!");
      }
      Node temp = head;
      for (int i = 1; i <= idx; i++){
          temp = temp.next;
      }
      return temp.val;
  }
  public void set(int idx , int val) throws  Error{
      if (idx == size-1){
          tail.val = val;
      }
      if (idx >= size || idx < 0) {
          throw new Error("Invalid idx !!");
      }
      Node temp = head;
      for (int i = 1; i <= idx; i++){
          temp = temp.next;
      }
      temp.val = val;
  }
  public void display(){
      Node temp = head;
      while (temp != null){
          System.out.print(temp.val + " ");
          temp = temp.next;
      }
      System.out.println();
  }
  public void deleteAtHead () throws Error{
      if (size==0) throw new Error("List is empty");
      head = head.next;
      size--;
  }
  public void delete (int idx) throws Error{
      if (idx==0) {
          deleteAtHead();
          return;
      }
      if (head == null) throw new Error("List is empty");
      if (idx < 0 || idx >= size)
          throw new Error("Invalid index");
      Node temp = head;
      for (int i = 1; i <= idx-1; i++){
          temp = temp.next;
      }
      if (temp.next == tail) temp = tail;
      temp.next = temp.next.next;
      size--;
  }
}
public class
implementationLL {
    public static void main(String[] args) {
      SLL list = new SLL();
      list.insertAtTail(12);
      list.insertAtTail(13);
      list.insertAtTail(14);
      list.insertAtTail(15);
      list.display();
        System.out.println("The size of the linked list is : " +list.size);
        list.insert(2,10);
        list.display();
        System.out.println(list.get(3));
        list.display();
        list.deleteAtHead();
        list.display();
    }
}
