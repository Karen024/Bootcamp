package Exercise.Day17.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        triangle.check(triangle);
        System.out.println(triangle.triangleArea(triangle));
        System.out.println(triangle.trianglePerimeter(triangle));
        triangle.isRight(triangle);
    }
}
