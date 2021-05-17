package Exercise.Day16.Arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {
    private int[] array;

    public Arithmetic() {
    }

    public Arithmetic(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void options() {
        printOptions();
        Scanner scn = new Scanner(System.in);
        int answer = scn.nextInt();
        while (answer != 0) {
            boolean check = false;
            if (answer == 3 || answer == 4 || answer == 5) {
                while (!check) {
                    System.out.println("Please sort array before this operation,or use another except 3,4,5");
                    answer = scn.nextInt();
                    if (answer != 3 && answer != 4 && answer != 5) {
                        check = true;
                    }
                }
            }
            if (answer == 1) {
                array = bubbleSort(array);
                System.out.println(toString());
                System.out.println();
                printOptions();
                answer = scn.nextInt();
            }
            if (answer == 2) {
                array = quickSort(array, 0, array.length - 1);
                System.out.println(toString());
                System.out.println();
                printOptions();
                answer = scn.nextInt();
            }
            if (answer == 3) {
                System.out.println("Please enter the key for search in array");
                int key = scn.nextInt();
                int index = binarySearch(array, key);
                if (index != -1) {
                    System.out.println("Element is under index " + index + " in array");
                } else {
                    System.out.println("No such element in array");
                }
                printOptions();
                answer = scn.nextInt();
            }
            if (answer == 4) {
                minElementInArray(array);
                System.out.println();
                printOptions();
                answer = scn.nextInt();
            }
            if (answer == 5) {
                maxElementInArray(array);
                printOptions();
                answer = scn.nextInt();
            }
            if (answer == 6) {
                arrayAverageSum(array);
                printOptions();
                answer = scn.nextInt();
            }
            if (answer == 7) {
                checkArithmeticProgression(array);
                printOptions();
                answer = scn.nextInt();
            }
        }
    }

    public int[] quickSort(int[] array, int low, int high) {
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

    public boolean isSortedCheck(int[] array) {
        for (int i = 10; i <= array.length - 1; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[high];
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

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            }
            if (array[mid] > key) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int[] bubbleSort(int[] array) {
        boolean swap = false;
        if (!isSortedCheck(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swap = true;
                    }
                }
                if (swap = false) {
                    break;
                }
            }
            return array;
        } else {
            return array;
        }
    }

    public void printOptions() {
        System.out.println("We have those options");
        System.out.println("Bubble sort -- 1");
        System.out.println("Quick sort -- 2");
        System.out.println("Binary search -- 3");
        System.out.println("Min element of array -- 4");
        System.out.println("Max element of array -- 5");
        System.out.println("Average sum of array -- 6");
        System.out.println("checkArithmeticProgression -- 7");
        System.out.println("Enter 0 to exit");
    }

    public void minElementInArray(int[] array) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minElement >= array[i]) {
                minElement = array[i];
            }
        }
        System.out.println("Array minimal element is = " + minElement);
    }

    public void maxElementInArray(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxElement <= array[i]) {
                maxElement = array[i];
            }
        }
        System.out.println("Array minimal element is = " + maxElement);
    }

    public void arrayAverageSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Array average sum is = " + sum / array.length);
    }

    public void checkArithmeticProgression(int[] array) {
        bubbleSort(array);
        int difference = array[1] - array[0];
        for (int i = 2; i <= array.length - 1; i++) {
            if ((array[i] - array[i - 1]) != difference) {
                System.out.println("Cant make arithmetic progression from this array");
            }
        }
        System.out.println("Arithmetic progression can be created from this array with difference = " + difference);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arithmetic)) return false;
        Arithmetic that = (Arithmetic) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "Arithmetic{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
