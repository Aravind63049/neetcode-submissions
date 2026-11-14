/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
        inorder(root, q);
        for (int i = 1; i < k; i++) {
            q.remove();
        }
        return q.poll();
    }

    private void inorder(TreeNode root, PriorityQueue<Integer> q) {
        if (root == null) return;
        inorder(root.left, q);
        q.add(root.val);
        inorder(root.right, q);
        
    }
}