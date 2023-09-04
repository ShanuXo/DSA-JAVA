package Recursion;

public class number {
    static int rev = 0;

    public static void Reverse(int n) {

        if (n == 0) {
            return;
        }
        int remain = n % 10;
        rev = rev * 10 + remain;
        Reverse(n / 10);
    }

    public static void main(String[] args) {
        Print(5);
        System.out.println("In reverse order");
        Revprint(5);
        System.out.println("Factorial of a Number : ");
        int ans = Fact(5);
        System.out.println(ans);
        System.out.println("Sum of the Number : " + Sum(5));
        System.out.println("Sum of Indiviual digit : " + SumofDigit(5481));
        System.out.println("Product of an Number : " + productDigit(1234));
        Reverse(1234);
        System.out.println(rev);
        // System.out.println(Pallin(1234321));
        System.out.println(Count(3030));

    }

    public static int Revprint(int n) {
        if (n == 0) {
            return n;
        }
        System.out.println(n);
        return Revprint(n - 1);
    }

    public static void Print(int n) {
        if (n == 0) {
            return;
        }
        Print(n - 1);
        System.out.println(n);
    }

    public static int Fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }

    public static int Sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + Sum(n - 1);
    }

    // 1234 = 1+2+3+4=10
    public static int SumofDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + SumofDigit(n / 10);
    }

    public static int productDigit(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productDigit(n / 10);
    }

    public static int Count(int n) {
        return Helper(n, 0);
    }

    private static int Helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return Helper(n / 10, count + 1);
        }
        return Helper(n / 10, count);
    }

}
