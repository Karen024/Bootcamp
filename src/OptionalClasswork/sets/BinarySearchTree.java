package OptionalClasswork.sets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    private MyNode<Integer> root;

    public static class MyNode<T> {
        private MyNode left;
        private MyNode right;
        private T data;

        public MyNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public MyNode getLeft() {
            return left;
        }

        public void setLeft(MyNode left) {
            this.left = left;
        }

        public MyNode getRight() {
            return right;
        }

        public void setRight(MyNode right) {
            this.right = right;
        }
    }

    public BinarySearchTree(Integer value) {
        this.root = new MyNode<>(value);
    }

    public void add(int key) {
        MyNode<Integer> current = root;
        MyNode<Integer> parent = null;
        addIfNoRootCreate(key);
        while (current != null) {
            parent = current;
            if (key < current.getData()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        if (key < parent.getData()) {
            parent.setLeft(new MyNode<Integer>(key));
        } else {
            parent.setRight(new MyNode<Integer>(key));
        }
    }

    private void addIfNoRootCreate(int key) {
        if (root == null) {
            root = new MyNode(key);
        }
    }

    public void bfsPrint() {
        if (treeEmptyCheck()) return;
        Queue<MyNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            MyNode<Integer> root = queue.poll();
            MyNode<Integer> leftNode = root.getLeft();
            MyNode<Integer> rightNode = root.getRight();
            System.out.print(root.getData() + " ");
            if (leftNode != null) {
                queue.add(leftNode);
            }
            if (rightNode != null) {
                queue.add(rightNode);
            }
        }
    }

    private boolean treeEmptyCheck() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void dfsPreOrderPrint() {
        if (treeEmptyCheck()) {
            return;
        }
        Stack<MyNode<Integer>> queue = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            MyNode<Integer> root = queue.pop();
            MyNode<Integer> leftNode = root.getLeft();
            MyNode<Integer> rightNode = root.getRight();
            System.out.print(root.getData() + " ");
            if (rightNode != null) {
                queue.add(rightNode);
            }
            if (leftNode != null) {
                queue.add(leftNode);
            }
        }
    }

    public void dfsInOrderPrint() {
        if (treeEmptyCheck()) {
            return;
        }
        Stack<MyNode<Integer>> queue = new Stack<>();
        MyNode<Integer> current = root;
        while (!queue.isEmpty() || current != null) {
            if (current != null) {
                queue.push(current);
                current = current.getLeft();
            } else {
                MyNode<Integer> node = queue.pop();
                System.out.print(" " + node.getData());
                current = node.getRight();
            }
        }
    }

    public void dfsPostOrderPrint() {
        Stack<MyNode<Integer>> stack1 = new Stack<>();
        Stack<MyNode<Integer>> stack2 = new Stack<>();

        if (treeEmptyCheck()) {
            return;
        }
        stack1.push(root);
        while (!stack1.isEmpty()) {
            MyNode<Integer> current = stack1.pop();
            stack2.push(current);
            if (current.getLeft() != null)
                stack1.push(current.getLeft());
            if (current.getRight() != null)
                stack1.push(current.getRight());
        }
        while (!stack2.isEmpty()) {
            MyNode<Integer> temp = stack2.pop();
            System.out.print(temp.getData() + " ");
        }
    }

    public void deleteRec(Integer value) {
        deleteRecImplementation(root, value);
    }

    public void deleteIterative(Integer value) {
        deleteIterativeImplementation(root, value);
    }

    private MyNode<Integer> deleteRecImplementation(MyNode<Integer> root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.getData())
            root.setLeft(deleteRecImplementation(root.getLeft(), key));
        else if (key > root.getData())
            root.setRight(deleteRecImplementation(root.getRight(), key));
        else {
            if (root.getLeft() == null)
                return root.getRight();
            else if (root.getRight() == null)
                return root.getLeft();
            root.setData(minValue(root.getRight()));
            root.setRight(deleteRecImplementation(root.getRight(), root.getData()));
        }
        return root;
    }

    Integer minValue(MyNode<Integer> root) {
        Integer minv = root.getData();
        while (root.getLeft() != null) {
            minv = (Integer) root.getLeft().getData();
            root = root.getLeft();
        }
        return minv;
    }

    private void deleteIterativeImplementation(MyNode<Integer> root, Integer value) {
        if (treeEmptyCheck()) {
            return;
        }
        Queue<MyNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            MyNode<Integer> temp = queue.poll();
            if (temp.getData() == value) {
                MyNode<Integer> current = root;
                MyNode<Integer> previous = null;
                while (current.getRight() != null) {
                    previous = current;
                    current = current.getRight();
                }
                temp.setData(current.getData());
                previous.setRight(null);
                current = null;
                return;
            }
            if (temp.getLeft() != null)
                queue.add(temp.getLeft());
            if (temp.getRight() != null)
                queue.add(temp.getRight());
        }
    }

    public MyNode<Integer> getRoot() {
        return root;
    }

    public int heightCalculationRecursive(MyNode<Integer> root) {
        if (treeEmptyCheck()) return 0;
        int leftHeight = 0;
        int rightHeight = 0;
        MyNode<Integer> leftNode = root.getLeft();
        MyNode<Integer> rightNode = root.getRight();
        if (leftNode != null) {
            leftHeight = heightCalculationRecursive(leftNode);
        }
        if (rightNode != null) {
            rightHeight = heightCalculationRecursive(rightNode);
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public int heightCalculationIterative(MyNode<Integer> root) {
        Queue<MyNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        while(!queue.isEmpty())
        {
            height++;
            for (int i=0;i<queue.size();i++)
            {
                MyNode<Integer> current = queue.poll();
                MyNode<Integer> leftNode = current.getLeft();
                MyNode<Integer> rightNode = current.getRight();
                if (leftNode != null) {
                    queue.add(leftNode);
                }
                if (rightNode != null) {
                    queue.add(rightNode);
                }
            }
        }
        return height;
    }
}
