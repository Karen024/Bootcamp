package Exercise.Day19.Geometry;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Square square = new Square(25);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println();
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
