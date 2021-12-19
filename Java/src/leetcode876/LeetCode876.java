package leetcode876;

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
	如果有两个中间结点，则返回第二个中间结点。
 * @author zhourx
 */
/*
 * 输入：[1,2,3,4,5,6]
	输出：此列表中的结点 4 (序列化形式：[4,5,6])
	由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点
	
	输入：[1,2,3,4,5]
	输出：此列表中的结点 3 (序列化形式：[3,4,5])
	返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
	注意，我们返回了一个 ListNode 类型的对象 ans，这样：
	ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 */
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
    public ListNode middleNode(ListNode head) {
        // 快慢指针法
        /*
        *定义一个快指针和慢指针，都只想头结点
        *快指针每次走两步，慢指针走一步，
        *如果快指针和快指针后一个节点都不为空，则可以继续
        *否则慢指针指向的节点就是要返回的元素
        */
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}