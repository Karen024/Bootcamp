package OptionalClasswork.lambdaExercises;

import java.util.function.Predicate;

public class Test {

    static public boolean isPrime(int number) {
        Predicate<Integer> predicate = (integer) -> {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };
        return predicate.test(number);
    }

    public boolean isOdd(int number) {
        Predicate<Integer> predicate = (integer) -> {
            if (integer % 2 == 0) {
                return false;
            }
            return true;
        };
        return predicate.test(number);
    }

    public boolean isPalindrome(int number) {
        StringBuilder numberToString = new StringBuilder(Integer.toString(number));
        StringBuilder reverse = new StringBuilder(numberToString);
        reverse.reverse();
        Predicate<Integer> predicate = (integer) -> {
            if (numberToString.toString().equals(reverse.toString())) {
                return true;
            }
            return false;
        };
        return predicate.test(number);
    }
}
