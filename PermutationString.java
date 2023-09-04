public class PermutationString {
    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void findPermutation(char[] char2, int currentIndex) {
        if (currentIndex == char2.length - 1) {
            System.out.println(String.valueOf(char2));
        }
        for (int i = currentIndex; i < char2.length; i++) {
            swap(char2, currentIndex, i);
            findPermutation(char2, currentIndex + 1);
            swap(char2, currentIndex, i);
        }
    }

    public static void conversion(String str) {
        if (str == null && str.length() == 0) {
            return;
        } else {
            findPermutation(str.toCharArray(), 0);
        }
    }

    public static void main(String args[]) {
        String st = "ABCD";
        conversion(st);
    }
}
