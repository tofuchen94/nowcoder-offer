package com.nowcoder.problem15;

import com.nowcoder.domain.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头
 * @author tofuchen
 *
 */
public class Solution {
	
	
	public ListNode ReverseList(ListNode head) {
		if(head==null)return head;
		ListNode node=head.next;
		head.next=null;
		while(node!=null) {
			ListNode next=node.next;
			node.next=head;
			head=node;
			node=next;
		}
		return head;

    }

}
