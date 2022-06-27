package leetcode24;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode two = head.next;
        ListNode three = head.next.next;
        two.next = head;
        head.next = swapPairs(three);
        return two;
    }
}