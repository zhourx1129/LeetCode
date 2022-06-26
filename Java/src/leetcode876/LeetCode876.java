package leetcode876;

/**
 * ����һ��ͷ���Ϊ head �ķǿյ������������������м��㡣
	����������м��㣬�򷵻صڶ����м��㡣
 * @author zhourx
 */
/*
 * ���룺[1,2,3,4,5,6]
	��������б��еĽ�� 4 (���л���ʽ��[4,5,6])
	���ڸ��б��������м��㣬ֵ�ֱ�Ϊ 3 �� 4�����Ƿ��صڶ������
	
	���룺[1,2,3,4,5]
	��������б��еĽ�� 3 (���л���ʽ��[3,4,5])
	���صĽ��ֵΪ 3 �� (����ϵͳ�Ըý�����л������� [3,4,5])��
	ע�⣬���Ƿ�����һ�� ListNode ���͵Ķ��� ans��������
	ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, �Լ� ans.next.next.next = NULL.
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
        // ����ָ�뷨
        /*
        *����һ����ָ�����ָ�룬��ֻ��ͷ���
        *��ָ��ÿ������������ָ����һ����
        *�����ָ��Ϳ�ָ���һ���ڵ㶼��Ϊ�գ�����Լ���
        *������ָ��ָ��Ľڵ����Ҫ���ص�Ԫ��
        */
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}