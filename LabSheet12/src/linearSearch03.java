import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch03 {

    public static ArrayList<Integer> traversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private static void preorder(Node node, ArrayList<Integer> list) {
        if (node == null) return;
        list.add(node.data);
        preorder(node.left, list);
        preorder(node.right, list);
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree();
        tree.printTree();

        ArrayList<Integer> list = traversal(tree.root);
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println("Traversal order : " + list);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        int resultIndex = linearSearch(nums, target);

        if (resultIndex != -1) {
            System.out.println("The target (" + target + ") at index " + resultIndex);
        } else {
            System.out.println("Cannot found " + target + " in this tree");
        }
    }
}