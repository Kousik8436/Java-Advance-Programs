class Solution {
    public int getMaxSum(Node root) {
        int[] res = solve(root);
        return Math.max(res[0], res[1]);
    }
        // code here
        private int[] solve(Node root) {
        if (root == null) return new int[]{0, 0};

        int[] left = solve(root.left);
        int[] right = solve(root.right);

        int include = root.data + left[0] + right[0];
        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{exclude, include};
    }
}
