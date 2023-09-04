public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int value) {
            this.data = value;
        }

        public Node(int value, Node n) {
            this.data = value;
            this.next = n;
        }

    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtRandomPosition(int val, Node prev) {
        Node newNode = new Node(val);
        if (prev == null) {
            System.out.print("Prev cannot be null");
            return;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void insertLast(int new_value) {
        Node new_Node = new Node(new_value);
        if (tail == null) {
            insertFirst(new_value);
            return;
        }
        tail.next = new_Node;
        tail = new_Node;
        size++;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(45);
        list.insertFirst(39);
        list.display();
        list.insertLast(567);
        // Node givenNode = list.head.next;
        // list.insertAtRandomPositio(24, givenNode);
        // System.out.print("Insertinf after a given node");
        list.display();
    }

}
