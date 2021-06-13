package OptionalClasswork.maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(3);
        sortingProblem(list);
    }

    public static void sortingProblem(List<Integer> array) {
        Collections.sort(array);
        Iterator<Integer> iterator = array.iterator();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Integer countOfNumber = 0;
        Integer currentNumber = array.get(0);
        while (true) {
            Integer current = iterator.next();
            if (!iterator.hasNext()) {
                treeMap.put(currentNumber, countOfNumber + 1);
                break;
            }
            if (current == currentNumber) {
                countOfNumber++;
            } else {
                treeMap.put(currentNumber, countOfNumber);
                currentNumber = current;
                countOfNumber = 1;
            }
        }
    }

    public static TreeMap<Integer, Integer> sortByValues(Map<Integer, Integer> map) {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1).compareTo(map.get(o2)) == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

}
