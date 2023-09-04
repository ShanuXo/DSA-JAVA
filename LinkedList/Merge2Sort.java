package LinkedList;

import java.util.LinkedList;

public class Merge2Sort {
    // To create an Node in Linked List
    class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
        }
    }

    public static void main(String[] args) {
        Merge2Sort list1 = new Merge2Sort();
        Merge2Sort list2 = new Merge2Sort();

        list1.addLast(new Node(2));
        list1.addLast(new Node(3));
        list1.addLast(new Node(4));

        list2.addLast(new Node(5));
        list2.addLast(new Node(6));
        list2.addLast(new Node(7));

    }
}
