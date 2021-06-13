package OptionalClasswork.sets;

import java.util.*;

public class SetProblems<T> {
    public int countOfElementsInHashSet(HashSet<T> hashSet) {
        int count = 0;
        Iterator<T> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    public boolean hashSetEmptyOrNot(HashSet<T> hashSet) {
        return hashSet.isEmpty();
    }

    public HashSet<T> hashSetClone(HashSet<T> hashSet) {
        return (HashSet<T>) hashSet.clone();
    }

    public TreeSet<T> hashSetToTreeSet(HashSet<T> hashSet) {
        Set<T> treeSet = new TreeSet<>(hashSet);
        return (TreeSet<T>) treeSet;
    }

    public ArrayList<T> hashSetToList(HashSet<T> hashSet) {
        List<T> list = new ArrayList<>(hashSet);
        return (ArrayList<T>) list;
    }

    public boolean compareHashSets(HashSet<T> hashSet1, HashSet<T> hashSet2) {
        Iterator<T> iterator = hashSet1.iterator();
        if (hashSet1.size() != hashSet2.size()) {
            return false;
        }
        while (iterator.hasNext()) {
            if (!hashSet2.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public void removeAllFromHashSet(HashSet<T> hashSet) {
        hashSet.removeAll(hashSet);
    }

    public void iterateTroughTreeSet(TreeSet<T> treeSet) {
        Iterator<T> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void firstLastInTreeSet(TreeSet<T> treeSet) {
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }

    public TreeSet<T> cloneTreeSet(TreeSet<T> treeSet) {
        return (TreeSet<T>) treeSet.clone();
    }

    public int numberOfElementsTreeSet(TreeSet<T> treeSet) {
        int count = 0;
        Iterator<T> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    public boolean compareTreeSet(TreeSet<T> treeSet1, TreeSet<T> treeSet2) {
        if (treeSet1.size() != treeSet2.size()) {
            return false;
        }
        Iterator<T> iterator = treeSet1.iterator();
        while (iterator.hasNext()) {
            if (!treeSet2.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public void lessThanSeven(TreeSet<Integer> treeSet) {
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != 7) {
                System.out.print(iterator.next() + " ");
            } else {
                break;
            }
        }
    }

    public Integer equalOrGreater(TreeSet<Integer> treeSet, Integer value) {
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            if (temp >= value) {
                return temp;
            }
        }
        return null;
    }

    public void removeFromTree(TreeSet<Integer> treeSet, Integer value) {
        treeSet.remove(value);
    }

    public void iterateTroughPriorityQueue(PriorityQueue<T> priorityQueue) {
        Iterator<T> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public boolean comparePriorityQueues(PriorityQueue<T> priorityQueue1, PriorityQueue<T> priorityQueue2) {
        if (priorityQueue1.size() != priorityQueue2.size()) {
            return false;
        }
        Iterator<T> iterator = priorityQueue1.iterator();
        while (iterator.hasNext()) {
            if (!priorityQueue2.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }

    public int[] arrayRotation(int[] array, int countOfShifts) {
        for (int i = 0; i < countOfShifts; i++) {
            int first = array[0];
            int j;
            for (j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[j] = first;
        }
        System.out.println(array.toString());
        return array;
    }
}
