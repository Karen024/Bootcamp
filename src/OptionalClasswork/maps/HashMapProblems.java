package OptionalClasswork.maps;

import java.util.*;

public class HashMapProblems<K, V, T> {
    public Map<K, V> copy(Map<K, V> map2) {
        Map<K, V> hashMap = new HashMap<>();
        hashMap.putAll(map2);
        return hashMap;
    }

    public Map<K, V> removeAll(Map<K, V> map) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> currentEntry = iterator.next();
            map.remove(currentEntry.getKey(), currentEntry.getValue());
        }
        return map;
    }

    public boolean isEmpty(Map<K, V> map) {
        return map.isEmpty();
    }

    public void keySet(Map<K, V> map) {
        Set<K> keySet = map.keySet();
        Iterator<K> iterator = keySet.iterator();
        System.out.print("Key Set [" + iterator.next());
        while (iterator.hasNext()) {
            System.out.print(" , " + iterator.next());
        }
        System.out.print("]");
    }

    public void entrySet(Map<K, V> map) {
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        Iterator<Map.Entry<K, V>> iterator = entrySet.iterator();
        System.out.println("Value Set [" + iterator.next().getValue());
        while (iterator.hasNext()) {
            System.out.print(" , " + iterator.next().getValue());
        }
        System.out.println("]");
    }

    public void associateKeyWithValue(TreeMap<K, V> treeMap, K key, V value) {
        treeMap.put(key, value);
    }

    public TreeMap<K, V> copy(TreeMap<K, V> treeMap) {
        TreeMap<K, V> newTreeMap = new TreeMap<>();
        newTreeMap.putAll(treeMap);
        return newTreeMap;
    }

    public Set<K> getFirstAndLastKeys(TreeMap<K, V> treeMap) {
        K firstKey = treeMap.firstKey();
        K lastKey = treeMap.lastKey();
        Set<K> firstAndLast = new TreeSet<>();
        firstAndLast.add(firstKey);
        firstAndLast.add(lastKey);
        return firstAndLast;
    }

    public Set<K> reverseKeySet(Map<K, V> map) {
        List<K> list = new ArrayList(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        Set<K> keySet = new LinkedHashSet<>(list);
        return keySet;
    }

    public Set<Integer> portionOfKeys(Map<Integer, V> map, Integer key) {
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current.compareTo(key) < 0) {
                keySet.remove(current);
            }
        }
        return keySet;
    }

    public Integer leastKey(Map<Integer, V> map, Integer key) {
        Set<Integer> keySet = portionOfKeys(map, key);
        if (keySet.isEmpty()) {
            return null;
        }
        Iterator<Integer> iterator = keySet.iterator();
        Integer leastKey = iterator.next();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (leastKey > current) {
                leastKey = current;
            }
        }
        return leastKey;
    }

    public List<Integer> sortingProblem(List<Integer> array) {
        Collections.sort(array);
        Iterator<Integer> iterator = array.iterator();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer countOfNumber = 0;
        Integer currentNumber = array.get(0);
        listToTreeMap(iterator, treeMap, countOfNumber, currentNumber);
        treeMap = sortByValues(treeMap);
        array.clear();
        return treeMapToArray(treeMap, array);
    }

    private void listToTreeMap(Iterator<Integer> iterator, TreeMap<Integer, Integer> treeMap, Integer countOfNumber, Integer currentNumber) {
        while (true) {
            if (!iterator.hasNext()) {
                treeMap.put(currentNumber, countOfNumber);
                break;
            }
            Integer current = iterator.next();
            if (current == currentNumber) {
                countOfNumber++;
            } else {
                treeMap.put(currentNumber, countOfNumber);
                currentNumber = current;
                countOfNumber = 1;
            }
        }
    }

    private TreeMap<Integer, Integer> sortByValues(Map<Integer, Integer> map) {
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int result = map.get(o1).compareTo(map.get(o2));
                if (result == 0) {
                    return 1;
                } else {
                    return result;
                }
            }
        };
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    private List<Integer> treeMapToArray(TreeMap<Integer, Integer> map, List<Integer> array) {
        Object count;
        int index = 0;
        Object[] values = map.values().toArray();
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            count = values[index];
            for (Integer i = (Integer) count; i != 0; i--) {
                array.add(key);
            }
            index++;
        }
        return array;
    }

    public  String commerceProblem(List<String> stringList) {
        Collections.sort(stringList);
        TreeMap<String, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        String currentString = stringList.get(0);
        Integer countOfString = 0;
        Iterator<String> iterator = stringList.iterator();
        stringListToTreeMap(treeMap, currentString, countOfString, iterator);
        return featuredOfDay(treeMap);
    }

    private static void stringListToTreeMap(TreeMap<String, Integer> treeMap, String currentString, Integer countOfString, Iterator<String> iterator) {
        while (true) {
            if (!iterator.hasNext()) {
                treeMap.put(currentString, countOfString);
                break;
            }
            String current = iterator.next();
            if (current.equals(currentString)) {
                countOfString++;
            } else {
                treeMap.put(currentString, countOfString);
                currentString = current;
                countOfString = 1;
            }
        }
    }

    private Integer maxValue(TreeMap<String, Integer> treeMap) {
        Object[] array = treeMap.values().toArray();
        Integer maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if ((Integer) array[i] > maxValue) {
                maxValue = (Integer) array[i];
            }
        }
        return maxValue;
    }

    private String featuredOfDay(TreeMap<String, Integer> treeMap) {
        Integer maxValue = maxValue(treeMap);
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> current = iterator.next();
            if (current.getValue() == maxValue) {
                return current.getKey();
            }
        }
        return null;
    }
}
