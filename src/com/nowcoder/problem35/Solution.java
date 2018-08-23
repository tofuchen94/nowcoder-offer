package com.nowcoder.problem35;

import java.util.HashSet;

import com.nowcoder.domain.ListNode;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * @author tofuchen
 *
 */
public class Solution {
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 HashSet<ListNode> set=new HashSet<ListNode>();
		 while(pHead1!=null) {
			 set.add(pHead1);
			 pHead1=pHead1.next;
		 }
		 while(pHead2!=null) {
			 if(set.contains(pHead2)) {
				 return pHead2;
			 }
			 pHead2=pHead2.next;
		 }
		 return null;
		 
    }

}
