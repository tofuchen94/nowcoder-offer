package com.nowcoder.problem57;

import com.nowcoder.domain.TreeLinkNode;

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode==null)return null;
        if(pNode.right!=null) {
        	TreeLinkNode node=pNode.right;
        	while(node.left!=null) {
        		node=node.left;
        	}
        	return node;
        }
        if(pNode.next==null) {
        	return null;
        }
        if(pNode.next.left==pNode) {
        	return pNode.next;
        }
        TreeLinkNode father=pNode.next;
        while(father!=null&&father.left!=pNode) {
        	pNode=father;
        	father=father.next;
        }
        return father;
    }

}
