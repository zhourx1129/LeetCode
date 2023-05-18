package leetcode2;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 两个都为空则返回空
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null) {
            l1 = new ListNode(0);
        }
        if (l2 == null) {
            l2 = new ListNode(0);
        }
        // 求和
        int sum = l1.val + l2.val;
        if (sum > 9) {
            if (l1.next == null) {
                l1.next = new ListNode(0);
            }
            l1.next.val++;
            return new ListNode(sum % 10, addTwoNumbers(l1.next, l2.next));
        }
        return new ListNode(sum % 10, addTwoNumbers(l1.next, l2.next));
    }
}
