package OptionalClasswork.lists.doubleLinkedlist;

import OptionalClasswork.lists.doubleLinkedlist.interfaces.Deque;
import OptionalClasswork.lists.doubleLinkedlist.interfaces.List;

import java.util.Objects;

public class MyDoubleLinkedList<T> implements List<T>, Deque<T> {

    //DOUBLE LINKED LIST METHODS

    MyNode<T> first;
    MyNode<T> last;
    int size;

    private class MyNode<T> {
        private MyNode last;
        private MyNode next;
        private T data;

        public MyNode(T data) {
            this.data = data;
        }

        public void connectToNodes(MyNode previous, MyNode next) {
            this.last = previous;
            this.next = next;
        }

        public void connectToNodeForward(MyNode current) {
            this.next = current;
        }

        public void connectToNodePrevious(MyNode current) {
            this.last = current;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public MyNode getLast() {
            return last;
        }

        public void setLast(MyNode last) {
            this.last = last;
        }

        public MyNode getNext() {
            return next;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }
    }

    public MyDoubleLinkedList() {

    }

    @Override
    public T get(int index) {
        if (indexInputCheck(index)) return null;
        if (index >= size) {
            index = index % size;
        }
        if (index <= size / 2) {
            return getFromStart(index);
        } else {
            return getFromEnd(index);
        }
    }

    private boolean indexInputCheck(int index) {
        try {
            if (index < 0 || index >= this.size()) {
                throw new MyIndexOutOfBoundsException();
            }
        } catch (MyIndexOutOfBoundsException e) {
            e.printMessage();
            return true;
        }
        return false;
    }

    private T getFromStart(int index) {
        MyNode<T> current = first;
        for (int i = 0; i <= index; i++) {
            if (i != index) {
                current = current.getNext();
            }
        }
        return current.getData();
    }

    private T getFromEnd(int index) {
        MyNode<T> current = last;
        for (int i = size - 1; i >= index; i--) {
            if (i != index) {
                current = current.getLast();
            }
        }
        return current.getData();
    }

    @Override
    public void add(T obj) {
        MyNode<T> newNode = new MyNode<T>((T) obj);
        if (ifNoFirstCreate(newNode)) return;
        if (ifNoLastCreate(newNode)) return;
        last.connectToNodeForward(newNode);
        newNode.connectToNodes(last, first);
        first.connectToNodePrevious(newNode);
        last = newNode;
        size++;
    }

    private boolean ifNoLastCreate(MyNode<T> newNode) {
        if (size == 1) {
            first.connectToNodeForward(newNode);
            newNode.connectToNodePrevious(first);
            last = newNode;
            size++;
            return true;
        }
        return false;
    }

    private boolean ifNoFirstCreate(MyNode<T> newNode) {
        if (size == 0) {
            newNode.connectToNodes(null, null);
            first = newNode;
            size++;
            return true;
        }
        return false;
    }

    public void removeAll(T obj) {
        int number = elementCountInList(obj);
        for (int i = 0; i < number; i++) {
            remove(obj);
        }
    }

    public void swapElements(T obj1, T obj2) {
        if (!this.contains(obj1) || !this.contains(obj2)) {
            System.out.println("There is non existing obj in list");
            return;
        }
        MyNode<T> current1 = first;
        MyNode<T> current2 = first;
        for (int i = 0; i < this.size(); i++) {
            if (current1.getData() == obj1) {
                continue;
            }
            current1 = current1.next;
        }
        for (int i = 0; i < this.size(); i++) {
            if (current2.getData() == obj2) {
                continue;
            }
            current2 = current2.next;
        }
        T temp = current1.getData();
        current1.setData(current2.getData());
        current2.setData(temp);
    }

    public void joinTwoLists(MyDoubleLinkedList<T> list) {
        if (list.isEmpty() || isEmpty()) {
            System.out.println("List is empty to join");
            return;
        }
        this.last.connectToNodeForward(list.first);
        list.last.connectToNodePrevious(this.last);
        list.last.connectToNodeForward(this.first);
        this.first.connectToNodePrevious(list.last);
        last = list.last;
        list.first = first;
        int temp = this.size;
        this.size += list.size;
        list.size += temp;
    }

    private boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public void clone(MyDoubleLinkedList<T> list2) {
        if (notEqualSpaceCheck(list2)) {
            return;
        }
        MyNode<T> currentList1 = this.first;
        MyNode<T> currentList2 = list2.first;
        for (int i = 0; i < list2.size(); i++) {
            currentList1.setData(currentList2.getData());
            currentList1 = currentList1.getNext();
            currentList2 = currentList2.getNext();
        }
    }

    private boolean notEqualSpaceCheck(MyDoubleLinkedList<T> list2) {
        try {
            if (this.size() < list2.size()) {
                throw new MyNotEqualSpaceException();
            }
        } catch (MyNotEqualSpaceException e) {
            e.printMessage();
            return true;
        }
        return false;
    }

    private int elementCountInList(T obj) {
        MyNode<T> current = first;
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (current.getData() == obj) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public void remove(int index) {
        if (indexInputCheck(index)) return;
        if (index >= size) {
            index = index % size;
        }
        if (ifStartIndexRemove(index)) return;
        MyNode<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        if (ifLastRemoveCheck(index, current)) return;

        current.getLast().connectToNodeForward(current.getNext());
        current.getNext().setLast(current.getLast());
        current.connectToNodes(null, null);
        size--;
    }

    private boolean ifLastRemoveCheck(int index, MyNode<T> current) {
        if (index == size - 1) {
            last = current;
            last.setNext(null);
            size--;
            return true;
        }
        return false;
    }

    private boolean ifStartIndexRemove(int index) {
        if (index == 0) {
            first = first.getNext();
            first.setLast(null);
            size--;
            return true;
        }
        return false;
    }

    @Override
    public void remove(T obj) {
        if (first.getData() == obj) {
            first = first.getNext();
            first.setLast(null);
            size--;
            return;
        }
        MyNode<T> current = first;
        for (int i = 0; i < size - 2; i++) {
            current = current.getNext();
            if (current.getData() == obj) {
                current.getLast().connectToNodeForward(current.getNext());
                current.getNext().setLast(current.getLast());
                current.connectToNodes(null, null);
                size--;
                return;
            }
        }
        if (last.getData() == obj) {
            last = current;
            current.setNext(null);
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T obj) {
        if (first.getData() == obj) {
            return true;
        }
        MyNode<T> current = first;
        for (int i = 0; i < size - 1; i++) {
            current = current.getNext();
            if (current.getData() == obj) {
                return true;
            }
        }
        if (last.getData() == obj) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    //DEQUE METHODS

    public void addDeque(T t) {
        MyNode<T> node = new MyNode<>(t);
        if (ifNoFirstCreate(node)) {
            return;
        }
        if (ifNoLastCreate(node)) {
            return;
        }
        addLast(t);
    }

    @Override
    public void addFirst(T t) {
        if (isEmpty()) {
            return;
        }
        MyNode<T> node = new MyNode<>(t);
        node.connectToNodes(null, first);
        first.connectToNodePrevious(node);
        first = node;
        size++;
    }

    @Override
    public void addLast(T t) {
        if (isEmpty()) {
            return;
        }
        MyNode<T> node = new MyNode<>(t);
        node.connectToNodes(last, null);
        last.connectToNodeForward(node);
        last = node;
        size++;
    }

    @Override
    public T getFirst() {
        if (size == 0) {
        }
        return first.getData();
    }

    @Override
    public T getLast() {
        if (size == 0) {
        }
        return last.getData();
    }

    @Override
    public void removeFirst() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            first = null;
            size--;
        }
        first.getNext().connectToNodePrevious(null);
        first = first.getNext();
        size--;
    }

    @Override
    public void removeLast() {
        if (size == 0) {
            return;
        }
        if (size == 1) {
            first = null;
            size--;
        }
        last.getLast().connectToNodeForward(null);
        last = last.getLast();
        size--;
    }

    @Override
    public void removeFirstOccurrence(T t) {
        MyNode<T> current;
        for (current = first; current != null; current = current.getNext()) {
            if (current.getData() == t) {
                removeDequeElement(current);
                return;
            }
        }
    }

    public void removeDequeElement(MyNode<T> node) {
        if (node == last) {
            node.getLast().connectToNodeForward(null);
            last = node.getLast();
            node.connectToNodes(null, null);
            size--;
            return;
        }
        if (node == first) {
            node.getNext().connectToNodePrevious(null);
            first = node.getNext();
            node.connectToNodes(null, null);
            size--;
            return;
        }
        node.getLast().connectToNodeForward(node.getNext());
        node.getNext().connectToNodePrevious(node.getLast());
        node.connectToNodes(null, null);
        size--;

    }

    @Override
    public void removeLastOccurrence(T t) {

        MyNode<T> current = last;
        for (current = last; current != null; current = current.getLast()) {
            if (current.getData() == t) {
                removeDequeElement(current);
                return;
            }
        }
    }

    @Override
    public boolean addAll(MyDoubleLinkedList<T> list2) {
        if (notEqualSpaceCheck(list2)) {
            return false;
        }
        MyNode<T> currentList2;
        for (currentList2 = list2.first; currentList2 != null; currentList2 = currentList2.getNext()) {
            addDeque(currentList2.getData());
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDoubleLinkedList)) return false;
        MyDoubleLinkedList<?> that = (MyDoubleLinkedList<?>) o;
        return size == that.size &&
                first.equals(that.first) &&
                last.equals(that.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last, size);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        MyNode<T> current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.getData());
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
