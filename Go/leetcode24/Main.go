package main

/**
 * Definition for singly-linked list.
 */
type ListNode struct {
	Val int
	Next *ListNode
}

func swapPairs(head *ListNode) *ListNode {
	if head.Next==nil || head==nil{
		return head
	}
	p := head
	// 链表的下一节点不为空，可以交换
	for head.Next!=nil{
		// 交换他们的val，不改变链表
		t:=0
		t=head.Val
		head.Val = head.Next.Val
		head.Next.Val = t
		// 交换完成，改变head的位置
		if head.Next.Next==nil{
			head = head.Next
		}else{
			head = head.Next.Next
		}
	}
	return p
}
func main() {
	swapPairs(&ListNode{})
}