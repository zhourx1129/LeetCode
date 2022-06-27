package leetcode19;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * @author zhourx
 */

/*
 * 输入：head = [1,2,3,4,5], n = 2
输出：[1,2,3,5]
输入：head = [1], n = 1
输出：[]
输入：head = [1,2], n = 1
输出：[1]
 */
public class LeetCode19 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
        // 使用快慢指针
        ListNode fast = dummy,slow = dummy;
        // 先让快指针先移动n位
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        // 快慢指针一起移动
        // 然后如果快指针为的话，慢指针指向的就是要删除的元素
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // 然后把慢指针的下个元素指向下下的元素即可
        slow.next = slow.next.next;
        return dummy.next;
    }
}