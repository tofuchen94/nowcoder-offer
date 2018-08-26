package com.nowcoder.problem55;

import com.nowcoder.domain.ListNode;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead==null)return null;
        ListNode slow=pHead;
        ListNode fast=pHead;
        while(fast!=null&&fast.next!=null) {
        	fast=fast.next.next;
        	slow=slow.next;
        	if(fast==slow){
        		break;
        	}
        }
        if(fast==null||fast.next==null)return null;
        fast=pHead;
        while(fast!=slow) {
        	fast=fast.next;
        	slow=slow.next;
        }
        return fast;
    }
	
	

}
