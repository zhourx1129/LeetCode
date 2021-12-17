package leetcode167;

import java.util.Arrays;

/**
 * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，
 * 请你从数组中找出两个数满足相加之和等于目标数 target 。
	函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，
	所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
	你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 * @author zhourx
 */
/*
 * 输入：numbers = [2,7,11,15], target = 9
	输出：[1,2]
	解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
	
	输入：numbers = [2,3,4], target = 6
	输出：[1,3]
	输入：numbers = [-1,0], target = -1
	输出：[1,2]
 */
public class LeetCode167 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] numbers = {2,7,11,15};
		int target = 9;
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.twoSum(numbers, target)));
	}
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int left = 0,right = numbers.length-1;
    	while (left<right) {
			if(numbers[left]+numbers[right] == target) {  //如果左边+右边==要查找的数，则返回下标
				return new int[] {left+1,right+1};
			}else if (numbers[left]+numbers[right] < target) { // 如果小于那个数，则左边的数小了
				left++;
			}else { // 如果大于那个数，则右边的数据大了
				right--;
			}
		}
    	return null;
    }
}