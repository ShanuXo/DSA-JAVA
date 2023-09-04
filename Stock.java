class Stock {
    static int maxStock(int[] price, int start, int end) {
        int profit = 0;
        if (end <= start) {
            return 0;
        }
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (price[j] > price[i]) {
                    int current_profit = price[j] - price[i] + maxStock(price, start, i - 1)
                            + maxStock(price, j + 1, end);
                    profit = Math.max(current_profit, profit);
                }
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        int[] arr = { 100, 200, 300, 400, 60, 700, 900 };
        int n = arr.length;
        System.out.println(maxStock(arr, 0, n - 1));
    }
}