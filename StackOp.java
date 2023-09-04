
public class StackOp {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Stack stack = new Stack(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Element in stack\t" + stack);
        System.out.println("Top Element of Stack\t" + stack.peek());
        System.out.println("Size of the Stack\t" + stack.size());
    }
}