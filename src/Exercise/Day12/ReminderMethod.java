package Exercise.Day12;

public class ReminderMethod {
    public static int reminder(int a) {
        int sum = 0;
        while (true) {
            if (a == 0) {
                break;
            }
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }

    public static int reminder(int a, int b) {
        return reminder(a) % b;
    }

    public static void main(String[] args) {
        int a = 5678;
        int b = 24;
        System.out.println(reminder(a));
        System.out.println(reminder(a, b));
    }
}
