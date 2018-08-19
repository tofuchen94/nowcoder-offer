package com.nowcoder.problem3;

import java.util.ArrayList;
import java.util.Collections;

import com.nowcoder.domain.ListNode;
/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author CDF
 *
 */
public class Solution {
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res=new ArrayList<>();
        while(listNode!=null){
        	res.add(listNode.val);
        	listNode=listNode.next;
        }
        Collections.reverse(res);
        return res;
    }

}
