package OptionalClasswork.arrayList;

import java.util.Arrays;
import java.util.Objects;

public class ArrayListImplementation {
    private final int DEFAULT_SIZE = 10;
    private Integer[] array;
    private int lastIndex;
    private int startIndex;
    private int actualIndex;


    public ArrayListImplementation() {
        array = new Integer[10];
        lastIndex = 9;
        startIndex = 0;
        actualIndex = 0;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    private Integer[] expandArrayList() {
        Integer[] expanded = new Integer[array.length + 10];
        for (int i = 0; i <= lastIndex; i++) {
            expanded[i] = array[i];
        }
        startIndex = lastIndex;
        lastIndex = lastIndex + 10;
        return expanded;
    }

    public void add(Integer integer) {
        if (startIndex < lastIndex) {
            array[startIndex] = integer;
            startIndex++;
            actualIndex++;
        } else if (startIndex == lastIndex) {
            array = expandArrayList();
            array[startIndex] = integer;
            startIndex++;
            actualIndex++;
        }
    }

    public Integer get(int index) {
        if (index >= array.length || index < 0) {
            return null;
        } else {
            return array[index];
        }
    }

    public void set(int index, Integer integer) {
        if (index >= array.length || index < 0) {
            return;
        } else {
            array[index] = integer;
        }
    }

    public void remove(int index) {
        if (index >= array.length || index < 0) {
            return;
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[lastIndex] = null;
            actualIndex--;
        }
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        actualIndex = 0;
    }

    public int size() {
        return actualIndex;
    }

    public void sort() {
        quickSort(array, 0, actualIndex-1);
    }

    private Integer[] quickSort(Integer[] array, int low, int high) {
        if (!isSortedCheck(array)) {
            if (low < high) {
                int pivot = partition(array, low, high);
                quickSort(array, low, pivot - 1);
                quickSort(array, pivot + 1, high);
            }
            return array;
        } else {
            return array;
        }
    }

    private boolean isSortedCheck(Integer[] array) {
        for (int i = 1; i <= actualIndex-1; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private int partition(Integer[] array, int low, int high) {
        Integer pivot = array[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public int lastIndexOf(Integer integer) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(integer)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(Integer integer) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(integer)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Integer integer) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(integer)) {
                return true;
            }
        }
        return false;
    }

    public void swap(Integer[] array, int i, int j) {
        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayListImplementation)) return false;
        ArrayListImplementation that = (ArrayListImplementation) o;
        return DEFAULT_SIZE == that.DEFAULT_SIZE &&
                lastIndex == that.lastIndex &&
                startIndex == that.startIndex &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(DEFAULT_SIZE, lastIndex, startIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
