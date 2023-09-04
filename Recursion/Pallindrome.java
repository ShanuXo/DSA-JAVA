package Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        int n = 11211;
        boolean check = checkPallindrome(n);
        System.out.println(check);
    }

    static boolean checkPallindrome(int n) {
        String str = String.valueOf(n);
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
