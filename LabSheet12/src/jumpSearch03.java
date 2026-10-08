import java.util.ArrayList;
import java.util.Scanner;

public class jumpSearch03 {

    public static ArrayList<Integer> traversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(Node node, ArrayList<Integer> list) {
        if (node == null) return;
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }

    public static int jumpSearch(int[] nums, int target) {
        int n = nums.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (prev < n && nums[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (prev < Math.min(step, n)) {
            if (nums[prev] == target) {
                return prev;
            }
            prev++;
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

        int resultIndex = jumpSearch(nums, target);

        if (resultIndex != -1) {
            System.out.println("The target (" + target + ") at index " + resultIndex);
        } else {
            System.out.println("Cannot found " + target + " in this tree");
        }
    }
}