package com.nowcoder.problem18;

import com.nowcoder.domain.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public void Mirror(TreeNode root) {
		if(root==null)return;
		Mirror(root.right);
		Mirror(root.left);
		TreeNode node=root.left;
		root.left=root.right;
		root.right=node;
	}

}
