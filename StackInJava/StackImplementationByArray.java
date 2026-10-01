package StackInJava;

class Stack {
    int[] arr = new int[5];
    int idx = 0;

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = x;
        idx++;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx - 1];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return idx;
    }

    boolean isEmpty() {
        return idx == 0;
    }

    boolean isFull() {
        return idx == arr.length;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0; // Optional: Clearing the popped value
        idx--;
        return top;
    }
}

public class StackImplementationByArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Top element is: " + st.peek());

        System.out.println("Popped element is: " + st.pop());

        System.out.println("Top element after pop is: " + st.peek());

        System.out.println("Current Stack elements:");
        st.display();
    }
}
