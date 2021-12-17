package leetcode344;

import java.util.Arrays;

/**
 * ��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� s ����ʽ������
	��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
 * @author zhourx
 *
 */
/*
 * ���룺s = ["h","e","l","l","o"]
	�����["o","l","l","e","h"]
	
	���룺s = ["H","a","n","n","a","h"]
	�����["h","a","n","n","a","H"]
 */
public class LeetCode344 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char[] s = {'h','e','l','l','o'};
		Solution solution = new Solution();
		solution.reverseString(s);
		System.out.println(Arrays.toString(s));
	}
}

class Solution {
    public void reverseString(char[] s) {
    	// ��˫ָ��
    	int left=0,right=s.length-1;
    	while (left<right) {
			char temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
    }
}