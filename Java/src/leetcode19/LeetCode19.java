package leetcode19;

/**
 * ����һ������ɾ������ĵ����� n ����㣬���ҷ��������ͷ��㡣
 * @author zhourx
 */

/*
 * ���룺head = [1,2,3,4,5], n = 2
�����[1,2,3,5]
���룺head = [1], n = 1
�����[]
���룺head = [1,2], n = 1
�����[1]
 */
public class LeetCode19 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	}
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        // ʹ�ÿ���ָ��
        ListNode fast = dummy,slow = dummy;
        // ���ÿ�ָ�����ƶ�nλ
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        // ����ָ��һ���ƶ�
        // Ȼ�������ָ��Ϊ�Ļ�����ָ��ָ��ľ���Ҫɾ����Ԫ��
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // Ȼ�����ָ����¸�Ԫ��ָ�����µ�Ԫ�ؼ���
        slow.next = slow.next.next;
        return dummy.next;
    }
}