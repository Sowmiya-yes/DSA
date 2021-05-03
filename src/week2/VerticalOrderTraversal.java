package week2;

import java.util.*;

class VOT {
    int data;
    VOT left, right;

    public VOT(int data) {
        this.data = data;
    }

    void printVerticalOrderTraversal(VOT root) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        printVerticalOrderTraversalUtil(root, map, 0);

//        for(Integer i: map.keySet()) {
//            for(Integer j: map.get(i)) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        for(Integer i: map.keySet()) {
            int n = map.get(i).size() - 1;
            System.out.println(map.get(i).get(n));
        }
    }

    private void printVerticalOrderTraversalUtil(VOT root, Map<Integer, List<Integer>> map, int i) {
        if(root == null)
            return;
        if(map.containsKey(i))
            map.get(i).add(root.data);
        else {
            List<Integer> temp = new ArrayList<>();
            temp.add(root.data);
            map.put(i, temp);
        }

        printVerticalOrderTraversalUtil(root.left, map, i - 1);
        printVerticalOrderTraversalUtil(root.right, map, i + 1);
    }
}

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        VOT tree = new VOT(1);
        tree.left = new VOT(2);
        tree.right = new VOT(4);
        tree.left.left = new VOT(11);
        tree.left.left.right = new VOT(15);
        tree.right.left = new VOT(9);
        tree.right.right = new VOT(3);

        tree.printVerticalOrderTraversal(tree);
    }
}
