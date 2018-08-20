package com.nowcoder.problem22;

import java.util.*;

import com.nowcoder.domain.TreeNode;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 * @author tofuchen
 *
 */
public class Solution {
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		ArrayList<Integer> res=new ArrayList<>();
		if(root==null)return res;
		else queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node=queue.poll();
			res.add(node.val);
			if(node.left!=null)queue.add(node.left);
			if(node.right!=null)queue.add(node.right);
		}
		return res;
	}

}
