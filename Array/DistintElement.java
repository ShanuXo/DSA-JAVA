package Array;

import java.util.HashMap;
import java.util.*;

public class DistintElement {
    /**
     * @param args
     */
    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 3, 5, 7, 8, 9, 5, 3 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);// put(key,value)
        }
        System.out.print(map.keySet());// to extraxt key from hashmap
    }
}

// static void distint(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// int j;
// for (j = 0; j < i; j++) {
// if (arr[i] == arr[j]) {
// break;
// }
// }
// if (i == j) {
// System.out.print(arr[i] + " ");
// }
// }
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 3, 4, 4, 1, 7, 9, 8, 9, 8 };
// int n = arr.length;
// distint(arr);
// }
