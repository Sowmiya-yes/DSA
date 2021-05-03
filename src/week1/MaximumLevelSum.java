package week1;

// Java implementation of the approach
public class MaximumLevelSum
{

    // A binary tree node has data, pointer to
// the left child and the right child 
    static class Node
    {
        int data;
        Node left, right;
    };

    static int maximum;

    // Helper function that allocates a
// new node with the given data and 
// null left and right pointers 
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }

    // Function to return the maximum
// levels in the given tree 
    static int maxLevel( Node root)
    {
        if(root == null)
            return 0;
        else {
            int left = maxLevel(root.left);
            int right = maxLevel(root.right);
            if(left > right)
                return left + 1;
            else
                return right + 1;
        }
    }

    // Function to find the maximum sum of a
// level in the tree using recursion 
    static void maxLevelSum(Node root,
                            int sum[], int current)
    {
        if(root == null)
            return;
        sum[current] += root.data;
        maxLevelSum(root.left, sum, current + 1);
        maxLevelSum(root.right, sum, current + 1);
    }

    // Function to find the maximum sum of a
// level in the tree using recursion 
    static int maxLevelSum( Node root) {
        int depth = maxLevel(root);
        int[] sum = new int[depth + 1];
        maxLevelSum(root, sum, 1);

        int max = 0;
        int index = 0;
        for(int i = 1; i <= depth; i++) {
            if(sum[i] > max) {
                max = sum[i];
                index = i;
            }
        }
        return index;
    }

    static int maximumPathSum(Node root) {
        if(root == null)
            return 0;
        int left = maximumPathSum(root.left);
        int right = maximumPathSum(root.right);

        int R1 = Math.max(Math.max(left, right) + root.data, root.data);
        int R2 = Math.max(R1, left + right + root.data);
        maximum = Math.max(R2, maximum);
        return R1;
    }

    // Driver code
    public static void main(String args[])
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.right = newNode(8);
        root.right.right.left = newNode(6);
        root.right.right.right = newNode(7);

//        System.out.println(maxLevelSum(root));
        maximumPathSum(root);
        System.out.println(maximum);
    }
} 