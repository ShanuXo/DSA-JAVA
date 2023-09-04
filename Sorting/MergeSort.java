package Sorting;

import java.util.*;

public class MergeSort {
    public static void merge(int[] arr, int s, int r, int m) {
        int n1 = m - s + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[s + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;

        int k = 1;// initial index of merged subarray array

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (i < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l / 2);
            sort(arr, l, m);

            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }

    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = { 3, 5, 2, 9, 6, 8, 10 };
        System.out.println("Unsorted Array");
        printArray(array);

        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);

        System.out.println("Merge Sorted Array");
        printArray(array);

    }
}
