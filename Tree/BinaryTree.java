package Tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        left = right = null;
        data = item;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {

        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.println(node.data + " ");
        printInorder(node.right);
    }

    void printInorder() {
        printInorder(root);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(2);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        System.out.println("Inorder traversal of bBinary Tree\t");
        bt.printInorder();
    }
}
