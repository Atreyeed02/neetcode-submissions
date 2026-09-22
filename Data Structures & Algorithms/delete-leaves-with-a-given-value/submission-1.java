class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if (root == null) return null;

        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        parent.put(root, null);
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();

            // Push children
            if (node.left != null) {
                parent.put(node.left, node);
                stack.push(node.left);
            }

            if (node.right != null) {
                parent.put(node.right, node);
                stack.push(node.right);
            }

            // Check leaf
            if (node.left == null && node.right == null &&
                node.val == target) {

                TreeNode p = parent.get(node);

                // Root itself
                if (p == null) {
                    return null;
                }

                // Remove from parent
                if (p.left == node) {
                    p.left = null;
                } else {
                    p.right = null;
                }
            }
        }

        return root;
    }
}