package Sorting;

public class Selection {
    public static void main(String args[]) {
        int[] arr = { 8, 7, 1, 2, 3, 4 };

        selectionSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = 1 + 1; j < arr.length; i++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

}
