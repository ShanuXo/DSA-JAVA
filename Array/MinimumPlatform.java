package Array;

import java.util.Arrays;

public class MinimumPlatform {

    public static int minPlatform(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int min_platform = 1;
        int result = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                min_platform++;
                i++;
            } else if (arr[i] > dep[j]) {
                min_platform--;
                j++;
            }
            if (min_platform > result) {
                result = min_platform;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platform Required:");
        System.out.print(minPlatform(arr, dep, n));
    }

}
