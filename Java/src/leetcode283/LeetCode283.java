
/**
 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 */
/*
 * ����: [0,1,0,3,12]
	���: [1,3,12,0,0]
 */
package leetcode283;
import java.util.Arrays;
public class LeetCode283 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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