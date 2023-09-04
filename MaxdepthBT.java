import java.util.*;
import java.lang.Math.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int x) {
        this.left = null;
        this.right = null;
        this.data = x;
    }
}

public class MaxdepthBT {
    static Node root;

    public MaxdepthBT() {
        root = null;

    }

    public static int maxDepth(Node node) {
        // corner cases
        if (node == null) {
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        return 1 + Math.max(left, right);
    }

    public void maxDepth() {
        maxDepth(root);
    }

    public static void main(String args[]) {
        MaxdepthBT md = new MaxdepthBT();
        md.root = new Node(1);
        md.root.left = new Node(2);
        md.root.right = new Node(3);
        md.root.right.left = new Node(4);
        md.root.right.right = new Node(5);
        md.root.right.left.left = new Node(6);
        md.root.right.left.right = new Node(7);

        System.out.println("Maximum Depth of an Tree:");
        md.maxDepth(root);
    }
}
