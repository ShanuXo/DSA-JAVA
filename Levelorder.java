import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

public class Levelorder {

    static Node root;

    void levelorder() {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {

            Node tempnode = q.poll();
            System.out.print(tempnode.data + " ");

            if (tempnode.left != null) {
                q.add(tempnode.left);
            }
            if (tempnode.right != null) {
                q.add(tempnode.right);
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String args[]) {
        Levelorder bt = new Levelorder();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        bt.levelorder();
    }
}
