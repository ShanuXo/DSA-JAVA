class Main {
    public static void main(String args[]) {
        int row = 9;
        // row
        for (int i = 0; i <= row; i++) {
            // space
            for (int j = i; j < row; j++) {
                System.out.println(" ");
            }
            // pattern
            for (int k = 1; k < (2 * i - 1); k++) {
                if (k == 1 || i == row || k == (2 * i - 1)) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println("");
        }
    }
}
