package PractiseSet1;

import java.util.Stack;

public class BSTIterator {
    Stack<BinarySearchTree> bstStack = new Stack<>();

    void pushToDeepLeft(BinarySearchTree root) {
        while (root != null) {
            bstStack.add(root);
            root = root.left;
        }
    }

    public BSTIterator(BinarySearchTree root) {
        pushToDeepLeft(root);
    }

    boolean hasNext() {
        return !bstStack.empty();
    }

    int next() {
        BinarySearchTree temp = bstStack.pop();
        pushToDeepLeft(temp.right);
        return temp.data;
    }

    public static void main(String[] args) {
        BinarySearchTree object = new BinarySearchTree();
        BinarySearchTree tree = object.constructTree();

        BSTIterator bstIterator = new BSTIterator(tree);
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
        System.out.println(bstIterator.hasNext());
    }
}