package OptionalClasswork.sets;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(5);
        binarySearchTree.bfsPrint();
        System.out.println();
        System.out.println(binarySearchTree.heightCalculationIterative(binarySearchTree.getRoot()));
    }
}
