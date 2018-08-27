package com.nowcoder.problem56;

import com.nowcoder.domain.ListNode;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead==null||pHead.next==null)return pHead;
		ListNode head=new ListNode(0);
		head.next=pHead;
		ListNode pre=head;
		ListNode p=pHead;
		while(p!=null) {
			ListNode last=findLast(p);
			if(last==p.next) {
				pre=p;
				p=p.next;
			}else {
				pre.next=last;
				p=last;
			}
		}
		return head.next;

    }
	
	private ListNode findLast(ListNode node) {
		ListNode res=node;
		while(res!=null) {
			if(res.val!=node.val) {
				return res;
			}
			res=res.next;
		}
		return res;
	}

}
