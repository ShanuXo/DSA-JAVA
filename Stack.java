class Stack {
    int capacity;
    int top;
    int[] arr;

    public Stack(int size) {
        top = -1;
        capacity = size;
        arr = new int[size];
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            System.exit(-1);
        }
        arr[++top] = x;
    }

    public int pop(int x) {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            System.exit(-1);
        }
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println(-1);
        }
        return -1;
    }

}
