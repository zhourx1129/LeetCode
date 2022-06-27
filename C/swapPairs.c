/*
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。

输入：head = [1,2,3,4]
输出：[2,1,4,3]
输入：head = []
输出：[] 
*/
//  Definition for singly-linked list.
#include<stdio.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* swapPairs(struct ListNode* head){
    // 空
    if (head == NULL || head->next==NULL)
        return head;
    // 新链表
    struct ListNode* p = head->next;
    // 第二个节点指向后面的节点，同时后面的节点又实行一次递归
    // 两两递归一次
    head->next= swapPairs(p->next);
    // 然后将每次递归的的第二个节点指向前一个节点
    p->next = head;
    // 返回链表即可
    return p;
}