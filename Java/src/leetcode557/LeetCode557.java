package leetcode557;
import java.util.Arrays;

public class LeetCode557 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "Let's take LeetCode contest";
		Solution solution = new Solution();
		System.out.println(solution.reverseWords(s));
	}

}
class Solution {
    public String reverseWords(String s) {
    	String[] a = s.split(" "); // ��ȡ�ָ�������
    	for (int i = 0; i < a.length; i++) {
			StringBuffer sb = new StringBuffer(a[i]);
			a[i] = sb.reverse().toString(); //�������ĵ��ʷ�תȻ��ת��Ϊ�ַ���
		}
    	return String.join(" ", a);
    }
}