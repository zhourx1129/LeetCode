/**
 * @Author: zhourx
 * @Date: 2023/9/14
 */
/*
    给定一个二叉树 root ，返回其最大深度。
    二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
*/
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        System.out.println(maxDepth(treeNode));
    }
    public static int maxDepth(TreeNode root) {
        //当前节点为空
        if (root==null)
            return 0;
        else {
            //如果节点不为空
            //左边节点高度
            int left = maxDepth(root.left);
            //右边节点高度
            int right = maxDepth(root.right);
            return left>right?left+1:right+1;
        }
    }
}