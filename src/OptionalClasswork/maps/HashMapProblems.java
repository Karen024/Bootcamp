package OptionalClasswork.maps;

import java.util.*;

public class HashMapProblems<K, V,T> {
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

    public void sortingProblem(List<Integer> array)
    {
        Collections.sort(array);
        Iterator<Integer> iterator = array.iterator();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        Integer countOfNumber = 0;
        Integer currentNumber = array.get(0);
        while(iterator.hasNext())
        {
            Integer current = iterator.next();
            if(current == currentNumber)
            {
                countOfNumber++;
            }
            else
            {
                treeMap.put(currentNumber,countOfNumber);
                currentNumber = current;
            }
        }
        System.out.println(treeMap.toString());
    }
}
