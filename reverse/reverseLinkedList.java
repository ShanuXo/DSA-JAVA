package reverse;

import java.util.LinkedList;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        next = null;
    }
}

public class reverseLinkedList {

    public static Node reverseRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Node head = new Node(1);
        reverseRecursion(head);
    }
}
