package com.nowcoder.problem14;

import com.nowcoder.domain.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode FindKthToTail(ListNode head, int k) {
		ListNode node=head;
		int i=0;
		while(i<k&&node!=null) {
			node=node.next;
			i++;
		}
		if(i<k&&node==null) {
			return null;
		}
		while(node!=null) {
			head=head.next;
			node=node.next;
		}
		return head;
	}

}
