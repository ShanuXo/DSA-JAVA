package LinearSerach;

public class BinarySearch {
    /**
     * @param args
     */
    public BinarySearch() {

    }

    public static void main(String args[]) {
        BinarySearch bs = new BinarySearch();
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 56 };
        int n = arr.length;
        int target = 9;
        int result = bs.binarysearch(arr, 0, n - 1, target);
        if (result == -1) {
            System.out.println("Elemnet is not present");
        } else {
            System.out.println("Element is present at : " + result);
        }
    }

    static int binarysearch(int[] arr, int s, int l, int x) {

        if (s > l) {
            return -1;
        } else {
            int mid = (s + l) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                return binarysearch(arr, x, mid + 1, l);
            } else if (x < arr[mid]) {
                return binarysearch(arr, x, s, mid - 1);
            }
        }
        return -1;
    }
}
