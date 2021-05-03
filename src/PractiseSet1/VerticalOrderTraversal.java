package PractiseSet1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderTraversal {

    static void printVOT(Map<Integer, LinkedList<Integer>> nodeMap) {
        for(Integer i: nodeMap.keySet()) {
            //prints the VOT
//            nodeMap.get(i).forEach(System.out::print);
            //prints the bottom view of the BT
            System.out.println(nodeMap.get(i).get(nodeMap.get(i).size() - 1));
        }
    }

    static void verticalOrderTraversal(BinaryTree root, Map<Integer, LinkedList<Integer>> nodeMap, int hd) {
        if(root == null)
            return;
        if(nodeMap.containsKey(hd))
            nodeMap.get(hd).add(root.data);
        else {
            LinkedList<Integer> temp = new LinkedList<>();
            temp.add(root.data);
            nodeMap.put(hd, temp);
        }
        verticalOrderTraversal(root.left, nodeMap, hd - 1);
        verticalOrderTraversal(root.right, nodeMap, hd + 1);
    }

    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();
        Map<Integer, LinkedList<Integer>> nodeMap = new TreeMap<>();
        VerticalOrderTraversal.verticalOrderTraversal(tree, nodeMap, 0);
        VerticalOrderTraversal.printVOT(nodeMap);
    }
}
