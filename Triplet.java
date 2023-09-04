public class Triplet {
    static boolean findTriplet(int[] arr, int n, int sum) {
        n = arr.length;
        sum = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.print("Triplet are " + arr[i] + "," + arr[j] + "," + arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Triplet three = new Triplet();
        int arr[] = { 10, 4, 24, 16, 8, 9, 53 };
        int sum = 40;
        int n = arr.length;
        three.findTriplet(arr, n, sum);

    }
}
