package LinearSerach;

import java.util.*;

public class LinearSerachjava {
    public static void main(String args[]) {
        int[] arr = { 2, 45, 76, 34, 12, 90, 76, 39, 69 };
        int target = 69;
        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }

    public static int LinearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (elem == target) {
                return i;
            }
        }
        return -1;
    }
}
