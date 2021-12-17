package leetcode977;

import java.util.Arrays;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，
 * 要求也按 非递减顺序 排序。
 * 输入：nums = [-4,-1,0,3,10]
	输出：[0,1,9,16,100]
	解释：平方后，数组变为 [16,1,0,9,100]
	排序后，数组变为 [0,1,9,16,100]
 * @author zhourx
 *
 */
public class leetcode977 {
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		Solution solution = new Solution();
		solution.sortedSquares(nums);
		System.out.println(Arrays.toString(nums));
	}
}

class Solution {
    public int[] sortedSquares(int[] nums) {
    	for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
    	sort(nums);
    	return nums;
    }
    public static void sort(int[] nums) {
    	quickSort(nums, 0, nums.length-1);
    }
    // 递归
    private static void quickSort(int[] arr, int left, int right) {
        if(left<right){
            int mid = recursive(arr, left, right);
            quickSort(arr, left, mid-1);
            quickSort(arr, mid+1, right);
        }
    }
    private static int recursive(int[] arr, int left, int right) {
        int tmp = arr[left];
        while (left < right){
            while (left<right && arr[right] >= tmp){
                right--;
            }
            arr[left] = arr[right];
            while (left<right && arr[left] <= tmp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[right] = tmp;
        return left;
    }
}