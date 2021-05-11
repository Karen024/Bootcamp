package Exercise.Day12;

public class SquareMethod {
    public static double square(int a) {
        return Math.PI * Math.pow(a, 2);
    }

    public static double square(float a) {
        return Math.pow(a, 2);
    }

    public static double square(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 5;
        float b = 6.0f;
        System.out.println(square(a));
        System.out.println(square(b));
        System.out.println(square(a, b));
    }
}
