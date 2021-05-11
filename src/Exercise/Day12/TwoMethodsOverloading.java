package Exercise.Day12;

public class TwoMethodsOverloading {
    public static int calculating(int a, int b) {
        return a + b;
    }

    public static float calculating(int a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 25;
        calculating(a, b);
        float b1 = b;
        calculating(a, b1);

    }
}
