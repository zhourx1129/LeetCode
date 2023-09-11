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
   /* public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode two = head.next;
        ListNode three = head.next.next;
        two.next = head;
        head.next = swapPairs(three);
        return two;
    }*/
/*    public ListNode swapPairs(ListNode head) {
        //如果当前节点和当前节点的下一节点是空，则直接返回当前节点
        if (head==null || head.next==null)
            return head;
        //定义当前节点的下一节点
        ListNode nextNode = head.next;
        //让当前节点指向下一节点的后续的节点，同时完成后面节点的递归指向
        head.next = swapPairs(nextNode.next);
        //当头结点指向“第三个节点”后 之前的第二节点就可以直接指向头结点（现在的第二节点）
        nextNode.next=head;
        return nextNode;
}*/

    public ListNode swapPairs(ListNode head){
         //如果当前节点和当前节点的下一节点是空，则直接返回当前节点
        if (head==null || head.next==null)
            return head;
        //定义当前节点的下一节点
        ListNode nextNode = head.next;
        //让当前节点指向下一节点的后续的节点，同时完成后面节点的递归指向
        head.next = swapPairs(nextNode.next);
        //当头结点指向“第三个节点”后 之前的第二节点就可以直接指向头结点（现在的第二节点）
        nextNode.next=head;
        return nextNode;
    }

}