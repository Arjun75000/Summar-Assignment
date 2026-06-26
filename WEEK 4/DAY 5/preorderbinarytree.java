class preorderbinarytree {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder,
                           int[] inorder,
                           int start,
                           int end) {

        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int pos = start;

        while (pos <= end) {
            if (inorder[pos] == root.val) {
                break;
            }
            pos++;
        }

        root.left = helper(preorder, inorder, start, pos - 1);

        root.right = helper(preorder, inorder, pos + 1, end);

        return root;
    }
}