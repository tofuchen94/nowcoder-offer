package com.nowcoder.problem26;

import com.nowcoder.domain.TreeNode;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree==null)return null;
		return helper(pRootOfTree)[0];
	}
	
	public TreeNode[] helper(TreeNode root) {
		if(root.left==null&&root.right==null) {
			return new TreeNode[] {root,root};
		}
		if(root.left==null) {
			TreeNode[] right=helper(root.right);
			root.right=right[0];
			right[0].left=root;
			return new TreeNode[] {root,right[1]};
		}else if(root.right==null) {
			TreeNode[] left=helper(root.left);
			root.left=left[1];
			left[1].right=root;
			return new TreeNode[] {left[0],root};
		}else {
			TreeNode[] right=helper(root.right);
			root.right=right[0];
			right[0].left=root;
			TreeNode[] left=helper(root.left);
			root.left=left[1];
			left[1].right=root;
			return new TreeNode[] {left[0],right[1]};
		}
		
	}

}
