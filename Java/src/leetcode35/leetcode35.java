package leetcode35;
/**
 * @author zhourx
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
/*
 * 输入: nums = [1,3,5,6], target = 7
	输出: 4
	
	输入: nums = [1,3,5,6], target = 2
	输出: 1
	
	输入: nums = [1,3,5,6], target = 5
	输出: 2
 */
public class leetcode35 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {1,3,5,6};
		int target = 5;
		System.out.println(new Solution().searchInsert(nums, target));
	}
}
class Solution {
    public int searchInsert(int[] nums, int target) {
    	return search(nums, target);
    }
    
    public static int search(int[] nums,int target) {
    	int right = nums.length-1;
    	int left = 0;
    	while (left<=right) {
    		int mid = left + ((right-left) >> 2);
    		if(nums[mid] > target) {
    			right = mid - 1;
    		}else if (nums[mid] < target) {
    			left = mid + 1;
    		} else {
    			return mid;
    		}
    	}
    	return left;
    }
}