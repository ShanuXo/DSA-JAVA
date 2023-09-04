package Strings;

public class Subsequence {
    static void printSequence(int index, String s, String f) {
        if (index == s.length()) {
            System.out.print(f + " ");
            return;
        }
        printSequence(index + 1, s, f + s.charAt(index));
        printSequence(index + 1, s, f);
    }

    public static void main(String[] args) {
        // String str = "shanu";
        // int n = str.length();
        // String substr = "";
        // for (int start = 0; start < n; start++) {
        // for (int end = start + 1; end <= n; end++) {
        // substr = str.substring(start, end);
        // }
        // System.out.println(substr);
        // }
        // String str = "shanu";
        // int n = str.length();

        // for (int num = 0; num < Math.pow(2, n - 1); num++) {
        // String substr = "";
        // for (int i = 0; i < n - 1; i++) {
        // if ((num & (1 << i)) != 0) {
        // substr += str.charAt(i);
        // }
        // }
        // System.out.println(substr);
        System.out.println("Print all the subsequence");
        printSequence(0, "abcd", " ");
    }
}
