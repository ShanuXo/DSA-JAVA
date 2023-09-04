package Occurance;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurencecharacter {
    public static void countChar(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        char[] ch = str.toCharArray();

        for (char c : ch) {

            if (map.containsKey(ch)) {
                map.put(c, map.get(ch) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        Occurencecharacter oc = new Occurencecharacter();
        String str1 = "Shanu";
        oc.countChar(str1);
    }
}
