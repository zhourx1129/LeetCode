

/**
 * @Author: zhourx
 * @Date: 2023/9/14
 */
/*
给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(nums));
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return move(nums,0,nums.length-1);
    }
    public static TreeNode move(int[] nums,int left,int right){
        //当左边大于右边则结束
        if (left>right)
            return null;
        //把中间节点作为根节点
        int mid = (left+right)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        // 左子树
        treeNode.left=move(nums,left,mid-1);
        // 右子树
        treeNode.right=move(nums,mid+1,right);
        return treeNode;
    }
}
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
