package Exercise.Day3;

public class StringConcatWithAnotherPrimitives {
    public static void main(String[] args) {
        String number1 = "5";
        int number2 = 10;
        System.out.println(number1 + " + " + number2 + " = " + (Integer.parseInt(number1) + number2));
        double number3 = 15.0;
        System.out.println(number1 + " + " + number3 + " = " + (Double.parseDouble(number1) + number3));
    }
}
