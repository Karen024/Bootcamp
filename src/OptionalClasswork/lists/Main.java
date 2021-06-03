package OptionalClasswork.lists;

import OptionalClasswork.lists.arrayList.MyArrayList;
import OptionalClasswork.lists.doubleLinkedlist.MyDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        MyDoubleLinkedList<Integer> list2 = new MyDoubleLinkedList<>();
        for (int i = 10; i < 16; i++) {
            list2.add(i);
        }
        System.out.println(list.toString());
        list.clone(list2);
        System.out.println(list.toString());
        MyArrayList<Integer> arrayList;
        arrayList = list.linkedListToArrayList();
        System.out.println(arrayList.toString());
    }
}
