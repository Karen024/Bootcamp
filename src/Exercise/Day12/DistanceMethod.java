package Exercise.Day12;

public class DistanceMethod {
    public static double distance(int x1, int x2) {
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
    }

    public static double distance(int x1, int x2, int x3, int x4) {
        return Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(x2 - x4, 2));
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 25;
        int d = 30;
        System.out.println(distance(a, b));
        System.out.println(distance(a, b, c, d));
    }
}
