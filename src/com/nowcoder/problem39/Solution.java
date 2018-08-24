package com.nowcoder.problem39;

import com.nowcoder.domain.TreeNode;
/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean IsBalanced_Solution(TreeNode root) {
		int res=helper(root);
		if(res>=0)return true;
		return false;
	}
	
	private int helper(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left=helper(root.left);
		int right=helper(root.right);
		if(left<0||right<0)return -1;
		if(Math.abs(left-right)>1)return -1;
		return Math.max(left, right)+1;
	}

}
