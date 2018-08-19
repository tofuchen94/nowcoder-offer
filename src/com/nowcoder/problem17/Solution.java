package com.nowcoder.problem17;

import com.nowcoder.domain.TreeNode;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author tofuchen
 *
 */
public class Solution {
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root2==null||root1==null)return false;
        if(equals(root1,root2))return true;
        else {
        	return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
        }
    }
	
	private boolean equals(TreeNode root1,TreeNode root2) {
		if(root1==null&&root2==null)return true;
		if(root1==null)return false;
		if(root2==null)return true;
		if(root1.val!=root2.val)return false;
		if(!equals(root1.left,root2.left)||!equals(root1.right,root2.right))return false;
		return true;
	}

}
