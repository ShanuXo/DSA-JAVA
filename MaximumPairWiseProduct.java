import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MaximumPairWiseProduct {
    public static int maxProdNaive(int[] arr) {
        int product = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                product = Math.max(product, arr[i] * arr[j]);
            }
        }
        return product;
    }

    public static int maxProdFast(List<Integer> arr) {
        int p1 = Integer.MIN_VALUE;
        int p2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num >= p1) {
                p2 = p1;
                p1 = num;
            } else if (num > p2) {
                p2 = num;
            }
        }
        return p1 * p2;
    }

    public static void maxProdStress(int N, int M) {
        Random rand = new Random();
        while (true) {
            int n = rand.nextInt(N - 1) + 2;
            List<Integer> A = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                A.add(rand.nextInt(M + 1));
            }
            System.out.println(A);
            int result1 = maxProdNaive(A.stream().mapToInt(i -> i).toArray());
            int result2 = maxProdFast(A);
            if (result1 == result2) {
                System.out.println("OK");
            } else {
                System.out.println("Wrong answer: " + result1 + " " + result2);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        maxProdStress(N, M);
    }
}
