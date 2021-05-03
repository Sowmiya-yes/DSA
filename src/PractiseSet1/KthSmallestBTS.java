package PractiseSet1;

public class KthSmallestBTS {
    static int count = 0, smallResult, largeResult, counter = 0;

    static void kthSmallest(BinarySearchTree root, int k) {
        if(root == null)
            return;
        kthSmallest(root.left, k);
        count++;
        if(count == k) { smallResult = root.data; return;}
        kthSmallest(root.right, k);
    }

    static void kthLargest(BinarySearchTree root, int k) {
        if(root == null)
            return;
        kthLargest(root.right, k);
        counter++;
        if(counter == k) { largeResult = root.data; return;}
        kthLargest(root.left, k);
    }

    public static void main(String[] args) {
        BinarySearchTree object = new BinarySearchTree();
        BinarySearchTree tree = object.constructTree();

        kthSmallest(tree, 1);
        System.out.println(smallResult);

        kthLargest(tree, 1);
        System.out.println(largeResult);
    }
}
