
//import java.util.Scanner;
import java.util.*;

public class printName {
    public static void main(String args[]) {

        int n = Integer.parseInt("10");
        int i = Integer.parseInt("0");
        print(i, n);

    }

    static int print(int i, int n) {
        if (i > n) {
            return -1;
        }
        System.out.println("Shanu");
        return print(i + 1, n);
    }

}
