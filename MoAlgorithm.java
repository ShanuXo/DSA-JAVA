import java.util.ArrayList;

class Query {
    int L;
    int R;

    public Query(int L, int R) {
        this.L = L;
        this.R = R;
    }
}

public class MoAlgorithm {
    public static void getSum(int[] arr, int n, ArrayList<Query> list, int m) {
        for (int i = 0; i < m; i++) {
            int L = list.get(i).L;
            int R = list.get(i).R;

            int sum = 0;

            for (int j = L; j <= R; j++) {
                sum += arr[j];

                System.out.println("Sum of [" + L + "," + R + "]" + "is" + " " + sum);
            }

        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = ar.length;

        ArrayList<Query> list = new ArrayList<Query>();
        list.add(new Query(0, 4));
        list.add(new Query(2, 4));
        list.add(new Query(3, 7));

        int m = list.size();
        getSum(ar, n, list, m);
    }
}
