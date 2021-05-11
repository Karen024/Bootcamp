package Exercise.Day12;

public class MethodOverloadingExample {
    public static void add(int a, int b) {
        System.out.println("First Method");
    }

    public static void add(int a, double b) {
        System.out.println("Second Method");
    }

    public static void add(double a, int b) {
        System.out.println("Third Method");
    }

    public static void main(String[] args) {
        int a = 0;
        double b = 0;
        add(a, a);
        add(a, b);
        add(b, a);
    }
}
