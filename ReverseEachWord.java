public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        String[] word = str.split("\\s");
        String revWord = "";

        for (String w : word) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            revWord += sb.toString() + " ";

        }
        return revWord.trim();
    }

    public static void main() {
        String str1 = "My Name is Shanu";
        // ReverseEachWord rw = new ReverseEachWord();
        System.out.print(reverseEachWord(str1));
    }
}
