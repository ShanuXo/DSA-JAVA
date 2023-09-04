package reverse;

public class reverseArray {
    static void reverse(int[] arr, int n) {
        int[] b = new int[n];
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            b[j] = arr[i];
            j = j - 1;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int n = array.length;
        reverse(array, n);
    }
}
