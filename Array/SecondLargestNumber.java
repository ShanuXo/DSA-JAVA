package Array;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        SecondLargest(arr, n);

    }

    public static void SecondLargest(int[] arr, int n) {
        n = arr.length;
        int i, first, second;
        if (n < 2) {
            System.out.println("Invalid Input");
            return;
        }
        second = Integer.MIN_VALUE;
        first = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No Second largest number");

        } else {
            System.out.println(second);
        }
    }
}
