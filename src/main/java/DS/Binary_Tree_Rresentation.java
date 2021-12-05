package DS;

public class Binary_Tree_Rresentation {
    static class Node
    {
        int data;
        Node right;
        Node left;
        public Node(int key)
        {
            data = key;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        System.out.println(root.right);

    }
}
