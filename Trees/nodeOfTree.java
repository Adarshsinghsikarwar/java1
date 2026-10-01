package Trees;

class Node{
    int val;
    Node left;
    Node right;
    Node (int val){
        this.val = val;
    }
}
public class nodeOfTree {
    public static void print (Node root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
    public static int sum (Node root){
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int max(Node root){
        if (root == null) return Integer.MIN_VALUE;
        int a = root.val; int b = max(root.left); int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int size(Node root){
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int levels(Node root){
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1);//  a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        print (a);

        System.out.println(b.val);
        System.out.println(a.left.val);
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(levels(a));

    }
}
