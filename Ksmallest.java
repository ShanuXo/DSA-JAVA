class Ksmallest {
    public static int kthSmallest(int[] arr, int l, int r, int k) {

        l = (l < r) ? l : r;
        // l=Math.min(l,r);
        // r=Math.max(l,r);
        for (int i = l; i < r; i++) {
            if (k > arr.length) {
                System.out.println("");
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            Arrays.sort(arr);
        }
        return arr[k - 1];
    }

}

public class Main {
    public static void main(String args[]) {
        int[] arr = { 7, 4, 8, 21, 56, 9, 2, 3 };
        int k = 5;
        kthSmallest(arr, 0, 7, 5);

    }
}
