package reverse;

public class rsecond {
    static void reverse(int[] arr, int n) {
        n = arr.length;
        for (int i = 0; i >= n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int n = array.length;
        reverse(array, n);
    }

}
