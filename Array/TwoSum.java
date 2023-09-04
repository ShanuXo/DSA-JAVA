package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 11, 3, 7, 9, 14, 2 };
        int target = 17;
        System.out.print(twoSum(arr, target));
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int second = target - arr[i];
            if (map.containsKey(second)) {
                result[0] = map.get(second);
                result[1] = i;
            }
            map.put(arr[i], i);
        }
        return result;
    }
}
