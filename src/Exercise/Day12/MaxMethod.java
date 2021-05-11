package Exercise.Day12;

public class MaxMethod {
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 8;
        int d = 3;
        System.out.println(max(a, b, c, d));
    }
}
