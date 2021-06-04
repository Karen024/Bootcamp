package OptionalClasswork.lists;

import OptionalClasswork.lists.doubleLinkedlist.MyDoubleLinkedList;
import OptionalClasswork.lists.doubleLinkedlist.interfaces.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> list1 = new MyDoubleLinkedList<>();
        Deque<Integer> list2 = new MyDoubleLinkedList<>();
        list1.addDeque(9);
        list1.addDeque(9);
        list1.addDeque(8);
        list1.addDeque(9);
        list1.addDeque(9);
        list2.addDeque(35);
        list2.addDeque(40);
        list2.addDeque(45);
        list2.addDeque(50);
        System.out.println(list1.toString());
        list1.addAll((MyDoubleLinkedList<Integer>) list2);
        System.out.println(list1.toString());
    }
}
