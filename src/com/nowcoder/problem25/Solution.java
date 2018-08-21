package com.nowcoder.problem25;

import com.nowcoder.domain.RandomListNode;
/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		RandomListNode node=new RandomListNode(0);
		RandomListNode node1=new RandomListNode(1);
		RandomListNode node2=new RandomListNode(2);
		RandomListNode node3=new RandomListNode(3);
		RandomListNode node4=new RandomListNode(4);
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node.random=node2;
		node1.random=node4;
		node4.random=node1;
		System.out.println(new Solution().Clone(node));
	}
	
	
	public RandomListNode Clone(RandomListNode pHead){
        if(pHead==null)return null;
        RandomListNode node=pHead;
        RandomListNode next=node.next;
        while(node!=null) {
        	next=node.next;
        	RandomListNode newNode=new RandomListNode(node.label);
        	node.next=newNode;
        	newNode.next=next;
        	node=next;
        }
        node=pHead;
        while(node!=null) {
        	RandomListNode newNode=node.next;
        	if(node.random==null) {
        		newNode.random=null;
        	}else {
        		newNode.random=node.random.next;
        	}
        	node=newNode.next;
        }
        node=pHead;
        RandomListNode resHead=new RandomListNode(0);
        RandomListNode resTail=resHead;
        while(node!=null) {
        	resTail.next=node.next;
        	resTail=resTail.next;
        	node=resTail.next;
        }
        return resHead.next;
    }

}
