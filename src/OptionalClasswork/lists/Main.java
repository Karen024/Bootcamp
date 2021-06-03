package OptionalClasswork.lists;

import OptionalClasswork.lists.doubleLinkedlist.MyDoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        MyDoubleLinkedList<Integer> linkedList = new MyDoubleLinkedList<>();
        for (int i = 1; i < 15; i++) {
            if (i == 7) {
                linkedList.add(null);
                continue;
            }
            linkedList.add(i);
        }
        System.out.println(linkedList.toString());
        System.out.println(linkedList.get(6));
        boolean check = linkedList.contains(null);
        System.out.println(check);
    }
}
