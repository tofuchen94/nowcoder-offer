package com.nowcoder.problem58;

import com.nowcoder.domain.TreeNode;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 * @author tofuchen
 *
 */
public class Solution {
	
	boolean isSymmetrical(TreeNode pRoot){
		if(pRoot==null)return true;
		return helper(pRoot.left,pRoot.right);
    }
	
	private boolean helper(TreeNode root1,TreeNode root2) {
		if(root1==null&&root2==null)return true;
		if(root1==null||root2==null)return false;
		if(root1.val!=root2.val)return false;
		return helper(root1.left,root2.right)&&helper(root1.right,root2.left);
	}
}
