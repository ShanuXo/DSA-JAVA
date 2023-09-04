package Array;

import java.util.ArrayList;

public class ArraySubsequence {

    // static void SubsequenceofArray(int index, ArrayList<Integer> list, int[] arr,
    // int n) {
    // n = list.size();
    // if (index == n) {
    // for (Integer it : list) {
    // System.out.print(list + " ");
    // }
    // if (n == 0) {
    // System.out.println("{}");
    // }
    // System.out.println();
    // return;
    // }
    // // take or pick the particular index into the subsequence.
    // list.add(arr[index]);
    // SubsequenceofArray(index + 1, list, arr, n);
    // list.remove(arr[index]);
    // // not pick or not take condition this element is not added to your
    // subsequence
    // SubsequenceofArray(index + 1, list, arr, n);
    // }

    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3 };
    // int n = 3;
    // ArrayList<Integer> list = new ArrayList<Integer>();
    // SubsequenceofArray(0, list, arr, n);
    // }

    static void generateSubsequences(int index, ArrayList<Integer> current, int[] arr) {
        if (index == arr.length) {
            if (!current.isEmpty()) {
                for (Integer num : current) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }

        // Include the current element in the subsequence
        current.add(arr[index]);
        generateSubsequences(index + 1, current, arr);

        // Exclude the current element from the subsequence
        current.remove(current.size() - 1);
        generateSubsequences(index + 1, current, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> current = new ArrayList<>();
        generateSubsequences(0, current, arr);
    }
}
