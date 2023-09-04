package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String");
        String s2 = sc.nextLine();
        // converting both string in lowercase

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // check whetther they have same length
        if (s1.length() == s2.length()) {
            // converting both the string in character
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // sort the character
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);

            if (result) {
                System.out.println(s1 + " and " + s2 + " are anangram.");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagram.");
            }
        } else {
            System.out.println(s1 + " and " + s2 + " are not equal.");
        }
        sc.close();
    }
}
