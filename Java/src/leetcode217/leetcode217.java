package leetcode217;

import java.util.Arrays;

/** 
 * @author zhourx
 *����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
   �������һֵ�������г����������Σ��������� true ��
   ���������ÿ��Ԫ�ض�����ͬ���򷵻� false ��
 */

/*
 * ����������Ȼ��������飬���Ԫ�����һ��Ԫ�����ظ����򷵻�true
 * ������ɺ�û�������ظ���Ԫ���򷵻�false
 * Ҳ����ʹ�ù�ϣ�������ǻ�ûѧ����ʱ������
 */
public class leetcode217 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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