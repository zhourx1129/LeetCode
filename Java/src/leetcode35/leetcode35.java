package leetcode35;
/**
 * @author zhourx
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ����������������
 * ���Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 */
/*
 * ����: nums = [1,3,5,6], target = 7
	���: 4
	
	����: nums = [1,3,5,6], target = 2
	���: 1
	
	����: nums = [1,3,5,6], target = 5
	���: 2
 */
public class leetcode35 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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