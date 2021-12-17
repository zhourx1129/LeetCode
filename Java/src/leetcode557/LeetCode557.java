package leetcode557;
import java.util.Arrays;

public class LeetCode557 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "Let's take LeetCode contest";
		Solution solution = new Solution();
		System.out.println(solution.reverseWords(s));
	}

}
class Solution {
    public String reverseWords(String s) {
    	String[] a = s.split(" "); // 获取分割后的数组
    	for (int i = 0; i < a.length; i++) {
			StringBuffer sb = new StringBuffer(a[i]);
			a[i] = sb.reverse().toString(); //将分组后的单词翻转然后转换为字符串
		}
    	return String.join(" ", a);
    }
}