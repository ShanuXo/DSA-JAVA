public class Mirror {
    /**
     * @param s
     * @return
     */
    public static String[] mirrorReverse(String s) {
        String[] str = s.split("\\s+");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "My Name is Shanu";
        String[] str2 = s.split(s);
        mirrorReverse(s);
    }

}
