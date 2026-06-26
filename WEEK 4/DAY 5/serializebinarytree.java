public class serializebinarytree {

    public String serialize(TreeNode root) {

        if (root == null) {
            return "N";
        }

        return root.val + "," +
               serialize(root.left) + "," +
               serialize(root.right);
    }

    int index = 0;

    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        index = 0;

        return build(arr);
    }

    private TreeNode build(String[] arr) {

        if (arr[index].equals("N")) {
            index++;
            return null;
        }

        TreeNode root =
            new TreeNode(Integer.parseInt(arr[index++]));

        root.left = build(arr);
        root.right = build(arr);

        return root;
    }
}
