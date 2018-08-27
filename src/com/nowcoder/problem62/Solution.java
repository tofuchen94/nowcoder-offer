package com.nowcoder.problem62;

import java.util.Stack;

import com.nowcoder.domain.TreeNode;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4
 * @author tofuchen
 *
 */
public class Solution {
	
	TreeNode KthNode(TreeNode pRoot, int k){
        Stack<TreeNode> stack=new Stack<>();
        TreeNode p=pRoot;
        while(p!=null||!stack.isEmpty()) {
        	while(p!=null) {
        		stack.push(p);
        		p=p.left;
        	}
        	if(!stack.isEmpty()) {
        		p=stack.pop();
        		if(k==1) {
        			return p;
        		}else {
        			k--;
        		}
        		p=p.right;
        	}
        }
        return null;
    }


}
