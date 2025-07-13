class Node
{
    int value;
    Node left, right;

    Node(int value)
    {
        this.value = value;
    }
}
public class NthHighest {
    static class Result
    {
        int value = -1;
        int level = -1;
    }

    public static void main(String[] args) {


        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.right.right.left = new Node(75);

        int k = 1; // Change this to get Kth largest
        Result result = new Result();
        findNthHighest(root, result,k);

        System.out.println("Level : " + result.level);
        System.out.println("Node : " + result.value);
    }
    static void findNthHighest(Node root, Result result, int k)
    {
        findNthHighestUtil(root,result,0,new int[]{0},k);
    }
    static void findNthHighestUtil(Node root, Result result, int level, int[] arr, int k)
    {
        if (root == null || arr[0] >= k)
        {
            return;
        }

        findNthHighestUtil(root.right, result, level+1, arr, k);

        arr[0]++;
        if (arr[0] == k)
        {
            result.level = level;
            result.value = root.value;
            return;
        }

        findNthHighestUtil(root.left, result, level+1, arr, k);
    }
}