package leetcode344;

import java.util.Arrays;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
	不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * @author zhourx
 *
 */
/*
 * 输入：s = ["h","e","l","l","o"]
	输出：["o","l","l","e","h"]
	
	输入：s = ["H","a","n","n","a","h"]
	输出：["h","a","n","n","a","H"]
 */
public class LeetCode344 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[] s = {'h','e','l','l','o'};
		Solution solution = new Solution();
		solution.reverseString(s);
		System.out.println(Arrays.toString(s));
	}
}

class Solution {
    public void reverseString(char[] s) {
    	// 简单双指针
    	int left=0,right=s.length-1;
    	while (left<right) {
			char temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
    }
}