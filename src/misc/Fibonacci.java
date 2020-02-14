package core;

public class Fibonacci {

    public static int f(int a, int b, int i, int n) {
        return i < n ? f(a + b, a, ++i, n) : a + b;
    }
}
