public class printBacktrack {
    public static void main(String args[]) {
        int n = Integer.parseInt("10");
        int i = Integer.parseInt("1");
        print(1, n);// backtrack in reverse;
    }

    static int print(int i, int n) {
        if (i > n) {
            return -1;
        }
        print(i + 1, n);
        System.out.print(i);

        return -1;
    }
}
