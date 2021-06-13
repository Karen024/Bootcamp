package OptionalClasswork.dynamicArray;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray<T> {
    private final int DEFAULT_SIZE = 10;
    private T[] array;
    private int lastIndex;
    private int startIndex;
    private int actualIndex;

    public DynamicArray() {
        array = (T[]) new Object[DEFAULT_SIZE];
        lastIndex = 9;
        startIndex = 0;
        actualIndex = 0;
    }

    private T[] expandArray() {
        T[] expanded = (T[]) new Object[DEFAULT_SIZE];
        for (int i = 0; i <= lastIndex; i++) {
            expanded[i] = array[i];
        }
        startIndex = lastIndex;
        lastIndex = lastIndex + 10;
        return expanded;
    }

    public void add(T t) {
        if (startIndex < lastIndex) {
            array[startIndex] = t;
            startIndex++;
            actualIndex++;
        } else if (startIndex == lastIndex) {
            array = expandArray();
            array[startIndex] = t;
            startIndex++;
            actualIndex++;
        }
    }

    public T get(int index) {
        if (indexValidCheck(index)) return null;
        return array[index];
    }

    private boolean indexValidCheck(int index) {
        if (index >= array.length || index < 0) {
            return true;
        }
        return false;
    }

    public void set(int index, T t) {
        if (indexValidCheck(index)) return;
        else {
            array[index] = t;
        }
    }

    public void remove(int index) {
        if (indexValidCheck(index)) return;
        else {
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

    public int indexOf(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == t) {
                return true;
            }
        }
        return false;
    }

    public void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int lastIndexOf(T t) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DynamicArray)) return false;
        DynamicArray that = (DynamicArray) o;
        return DEFAULT_SIZE == that.DEFAULT_SIZE &&
                lastIndex == that.lastIndex &&
                startIndex == that.startIndex &&
                actualIndex == that.actualIndex &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(DEFAULT_SIZE, lastIndex, startIndex, actualIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", array=" + Arrays.toString(array) +
                ", lastIndex=" + lastIndex +
                ", startIndex=" + startIndex +
                ", actualIndex=" + actualIndex +
                '}';
    }
}
