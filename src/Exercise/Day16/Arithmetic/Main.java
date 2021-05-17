package Exercise.Day16.Arithmetic;

public class Main {
    public static void main(String[] args) {
        int[] array = {25, 27, 29, 31, 33};
        Arithmetic arithmetic = new Arithmetic(array);
        arithmetic.options();
        System.out.println();
        System.out.println(arithmetic.toString());
    }
}
