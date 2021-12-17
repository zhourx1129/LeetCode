package leetcode189;

import java.util.Arrays;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
	输入: nums = [1,2,3,4,5,6,7], k = 3
	输出: [5,6,7,1,2,3,4]
	解释:
	向右轮转 1 步: [7,1,2,3,4,5,6]
	向右轮转 2 步: [6,7,1,2,3,4,5]
	向右轮转 3 步: [5,6,7,1,2,3,4]
	
	输入：nums = [-1,-100,3,99], k = 2
	输出：[3,99,-1,-100]
	解释: 
	向右轮转 1 步: [99,-1,-100,3]
	向右轮转 2 步: [3,99,-1,-100]
 * @author zhourx
 *
 */
public class leetCode189 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[] nums = {1,2,3,4,5,6,7};
		int[] nums = {-1,-100,3,99};
		int k = 2;
		Solution solution = new Solution();
		solution.rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}
}
class Solution {
    public void rotate(int[] nums, int k) {
    	int[] arr = new int[nums.length];
    	for (int i = 0; i < arr.length; i++) {
			arr[(i+k)%nums.length] = nums[i];
		}
    	for (int i = 0; i < arr.length; i++) {
			nums[i] = arr[i];
		}
    }
}
//超出时间限制
/*
 * class Solution { public void rotate(int[] nums, int k) { for (int i = 0; i <
 * k; i++) { reverse(nums); System.out.println(Arrays.toString(nums)); } }
 * 
 * public static void reverse(int[] nums) { int temp = nums[nums.length-1]; for
 * (int i = nums.length-2; i >= 0; i--) { nums[i+1] = nums[i]; } nums[0] = temp;
 * } }
 */