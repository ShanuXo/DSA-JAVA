package Tree;

class Node {
    int data;
    Node left, right;
    public int key;

    Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

public class Binary {
    Node root;

    Binary() {
    }

    Binary(int value) {
        root = new Node(value);
    }

    void insert(int val) {
        root = new Node(val);
    }

    Node insertInto(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (key < root.key) {
            root.left = insertInto(root.left, key);
        } else if (key > root.key) {
            root.right = insertInto(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderO(root);
    }

    void inorderO(Node node) {
        if (node != null) {
            inorderO(node.left);
            System.out.println(node.data + "");
            inorderO(node.right);
        }
    }

    public static void main(String[] args) {
        Binary bt = new Binary();
        bt.insert(50);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);
        bt.insert(60);
        bt.insert(70);
        bt.inorder();
    }
}
