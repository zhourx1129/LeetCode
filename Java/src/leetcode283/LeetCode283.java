
/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
/*
 * 输入: [0,1,0,3,12]
	输出: [1,3,12,0,0]
 */
package leetcode283;
import java.util.Arrays;
public class LeetCode283 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {0,1,0,3,12};
		 Solution solution = new Solution();
		 solution.moveZeroes(nums);
		 System.out.println(Arrays.toString(nums));
	}

}
class Solution {
    public void moveZeroes(int[] nums) {
    	int count = 0,j = 0;
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0){
				nums[j++] = nums[i];
			}
		}
    	while(j<nums.length){
    		nums[j++] = 0;
    	}
    }
}