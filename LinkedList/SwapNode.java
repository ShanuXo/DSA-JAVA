package LinkedList;

import java.util.LinkedList;
import java.util.*;

public class SwapNode {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;

        }
    }

    public static void swap() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    private SwapNode list;

    public void push(int newdata) {
        Node newNode = new Node(newdata);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwapNode m = new SwapNode();
        LinkedList list = new LinkedList();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("Given Linked List");
        m.list.printList();
        m.list.swap();
        System.out.println("List after swapping");
        m.list.printList();

    }
}
