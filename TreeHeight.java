import java.util.HashMap;
import java.util.Map;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeHeight {
    TreeNode root;
    Map<Integer, TreeNode> nodes = new HashMap<>();

    public void buildTree(int[] parent) {
        for (int i = 0; i < parent.length; i++) {
            if (!nodes.containsKey(i)) {
                nodes.put(i, new TreeNode(i));
            }

            int parentIdx = parent[i];
            if (parentIdx != -1) {
                TreeNode parentNode = nodes.get(parentIdx);
                if (parentNode.left == null) {
                    parentNode.left = nodes.get(i);
                } else {
                    parentNode.right = nodes.get(i);
                }
            } else {
                root = nodes.get(i);
            }
        }
    }

    public static int treeHeight(TreeNode node) {
        if (node == null)
            return 0;
        int left = treeHeight(node.left);
        int right = treeHeight(node.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeHeight th = new TreeHeight();
        int[] parent = { -1, 0, 4, 0, 3 };
        th.buildTree(parent);
        System.out.println(treeHeight(th.root));
    }
}
