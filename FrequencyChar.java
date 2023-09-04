import java.util.*;
import java.util.Scanner;

public class FrequencyChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] freq = new int[str.length()];
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;

                    ch[j] = '0';
                }
            }
        }
        System.out.println("Frequency of character");
        for (int k = 0; k < freq.length; k++) {
            if (ch[k] != ' ' && ch[k] != '0') {
                System.out.println(ch[k] + " " + "->" + freq[k]);
            }
        }
    }

}
