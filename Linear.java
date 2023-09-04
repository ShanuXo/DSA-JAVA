public class Linear {
    public static void main(String args[]) {
        int[] arr = { 2, 45, 76, 34, 12.90, 76, 39, 69 };
        int target = 69;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

    public static int LinearSearch(int[] array,target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (elem == target) {
                return i;
            }
        }
        return -1;
    }
}
