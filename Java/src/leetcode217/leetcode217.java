package leetcode217;

import java.util.Arrays;

/** 
 * @author zhourx
 *给定一个整数数组，判断是否存在重复元素。
   如果存在一值在数组中出现至少两次，函数返回 true 。
   如果数组中每个元素都不相同，则返回 false 。
 */

/*
 * 将数组排序，然后遍历数组，如果元素与后一个元素有重复，则返回true
 * 遍历完成后，没有遇见重复的元素则返回false
 * 也可以使用哈希表处理，但是还没学，暂时不考虑
 */
public class leetcode217 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int[] arr = {1,1,1,3,3,4,3,2,4,2};
		int[] arr = {2,14,18,22,22};
		Solution solution = new Solution();
		System.out.println(solution.containsDuplicate(arr));
	}

}
class Solution {
    public boolean containsDuplicate(int[] nums) {
		/*
		 * for (int i = 0; i < nums.length-1; i++) { for (int j = i+1; j < nums.length;
		 * j++) { if (nums[j] == nums[i]) { return true; } } } return false;
		 */
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1])
				return true;
		}
    	return false;
    }
}