package PractiseSet1;

import java.util.ArrayList;
import java.util.List;

public class LevelAndSprialLevelOrderTraversal {

    static boolean leftToRight = true;

    static void printLevelOrderTraversal(BinaryTree root, List<List<Integer>> temp, int level) {
        if(root == null)
            return;
        if(level == temp.size())
            temp.add(new ArrayList<>());
        temp.get(level).add(root.data);
        printLevelOrderTraversal(root.left, temp, level + 1);
        printLevelOrderTraversal(root.right, temp, level + 1);
    }

    static void printSpiralLevelOrderTraversal(BinaryTree root, int level) {
        if(root == null)
            return;
        if (level == 1)
            System.out.println(root.data);
        else {
            if (leftToRight) {
                printSpiralLevelOrderTraversal(root.left, level - 1);
                printSpiralLevelOrderTraversal(root.right, level - 1);
            } else {
                printSpiralLevelOrderTraversal(root.right, level - 1);
                printSpiralLevelOrderTraversal(root.left, level - 1);
            }
        }
    }

    static void levelOrderTraversalUsingDepth(BinaryTree root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            levelOrderTraversalUsingDepth(root.left, level-1);
            levelOrderTraversalUsingDepth(root.right, level-1);
        }
    }

    static int findDepth(BinaryTree root) {
        if(root == null)
            return 0;
        else
            return Math.max(findDepth(root.left), findDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();

        List<List<Integer>> temp = new ArrayList<>();
        //Just LOT
        int depth = findDepth(tree);
//        for(int i = 1; i <= depth; i++)
//            levelOrderTraversalUsingDepth(tree, i);

        //LOT in a list format
//        printLevelOrderTraversal(tree, temp, 0);

        //Spiral LOT using depth
        for(int i = 1; i <= depth; i++) {
            printSpiralLevelOrderTraversal(tree, i);
            leftToRight = !leftToRight;
        }

//        temp.forEach( e -> e.forEach(System.out::println));
    }
}
