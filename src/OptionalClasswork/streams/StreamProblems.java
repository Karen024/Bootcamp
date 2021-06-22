package OptionalClasswork.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamProblems {
    public int sumOfList(List<Integer> list) {
        return list.stream().mapToInt((integer) -> {
            return integer.intValue();
        }).sum();
    }

    public int sumOfListOdds(List<Integer> list) {
        return list.stream().filter((integer) -> {
            if (integer % 2 == 0) {
                return false;
            }
            return true;
        }).collect(Collectors.toList()).stream().mapToInt((integer) -> {
            return integer.intValue();
        }).sum();
    }

    public int sumOfListEvens(List<Integer> list) {
        return list.stream().filter((integer) -> {
            if (integer % 2 == 0) {
                return true;
            }
            return false;
        }).collect(Collectors.toList()).stream().mapToInt((integer) -> {
            return integer.intValue();
        }).sum();
    }

    public int sumDividableOnThree(List<Integer> list) {
        return list.stream().filter((integer) -> {
            if (integer % 3 == 0) {
                return true;
            }
            return false;
        }).collect(Collectors.toList()).stream().mapToInt((integer) -> {
            return integer.intValue();
        }).sum();
    }

    public int sumOfArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    public int sumOfArrayOdds(int[] array) {
        return Arrays.stream(array).filter((integer) -> {
            if (integer % 2 == 0) {
                return false;
            }
            return true;
        }).sum();
    }

    public int sumOfArrayEvens(int[] array) {
        return Arrays.stream(array).filter((integer) -> {
            if (integer % 2 == 0) {
                return true;
            }
            return false;
        }).sum();
    }

    public int sumDividableOnThree(int[] array) {
        return Arrays.stream(array).filter((integer) -> {
            if (integer % 3 == 0) {
                return true;
            }
            return false;
        }).sum();
    }

    public List<String> allToUpperCase(List<String> list) {
        return list.stream().map((string) -> {
            return string.toUpperCase();
        }).collect(Collectors.toList());
    }

    public List<String> filterList(List<String> list) {
        return list.stream().filter((string) -> {
            if (string.length() < 4) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());
    }

    public List<String> flattenMultidimensionalCollection(List<List<String>> list) {
        return list.stream().flatMap(stringlist -> stringlist.stream()).collect(Collectors.toList());
    }

    public Person oldestPerson(List<Person> list) {
        Optional<Person> optionalPerson = list.stream().max((person1, person2) -> {
            return person1.compareTo(person2);
        });
        return optionalPerson.get();
    }

    public List<Person> allKids(List<Person> list) {
        List<Person> childes = list.stream().filter((person) -> {
            if (person.getAge() >= 18) {
                return false;
            }
            return true;
        }).collect(Collectors.toList());
        return childes;
    }

    public Map<Boolean, List<Person>> kidsAndNot(List<Person> list) {
        Map<Boolean,List<Person>> map = list.stream().collect(Collectors.partitioningBy((person) -> {
            if (person.getAge() >= 18) {
                return true;
            }
            return false;
        }));
        return map;
    }
}
