package leetcode189;

import java.util.Arrays;

/**
 * ����һ�����飬�������е�Ԫ��������ת k ��λ�ã����� k �ǷǸ�����
	����: nums = [1,2,3,4,5,6,7], k = 3
	���: [5,6,7,1,2,3,4]
	����:
	������ת 1 ��: [7,1,2,3,4,5,6]
	������ת 2 ��: [6,7,1,2,3,4,5]
	������ת 3 ��: [5,6,7,1,2,3,4]
	
	���룺nums = [-1,-100,3,99], k = 2
	�����[3,99,-1,-100]
	����: 
	������ת 1 ��: [99,-1,-100,3]
	������ת 2 ��: [3,99,-1,-100]
 * @author zhourx
 *
 */
public class leetCode189 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
//����ʱ������
/*
 * class Solution { public void rotate(int[] nums, int k) { for (int i = 0; i <
 * k; i++) { reverse(nums); System.out.println(Arrays.toString(nums)); } }
 * 
 * public static void reverse(int[] nums) { int temp = nums[nums.length-1]; for
 * (int i = nums.length-2; i >= 0; i--) { nums[i+1] = nums[i]; } nums[0] = temp;
 * } }
 */