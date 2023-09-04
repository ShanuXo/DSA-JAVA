package Recursion;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        System.out.println(Search(arr, target, 0));
        System.out.println(SerachIndex(arr, target, 0));
    }

    static boolean Search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }

    static int SerachIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return SerachIndex(arr, target, index + 1);
        }
    }
}
