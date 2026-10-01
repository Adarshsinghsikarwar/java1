package Trees;

public class traversals {
        public static void main (String[]args){
            Node a = new Node(1); //  a is the root
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            Node g = new Node(7);

            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.left = f;
            c.right = g;
        }

        public  static  void display(Node root){
            if(root == null) return;
            System.out.println(root.val + " ");
            display(root.left);
            display(root.right);
        }

        public static  int sum(Node root){
            if(root == null) return 0;
            return root .val + sum(root.left) + sum((root.right));
        }

        public  static  int max(Node root){
            if(root == null) return Integer.MIN_VALUE;
            int a = root.val;
            int b = max(root.left);
            int c = max(root.right);
            return Math.max(a , Math.max(b , c));
        }
        public static  int size(Node root){
            if(root == null) return 0;
            int sizeOfTree = 1 + size(root.left) + size(root.right);

            return sizeOfTree;
        }

}























