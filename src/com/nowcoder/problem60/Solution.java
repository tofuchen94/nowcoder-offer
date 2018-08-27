package com.nowcoder.problem60;

import java.util.ArrayList;
import java.util.LinkedList;

import com.nowcoder.domain.TreeNode;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * @author tofuchen
 *
 */
public class Solution {
	
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		LinkedList<TreeNode> nodes=new LinkedList<>();
		if(pRoot==null)return res;
		nodes.add(pRoot);
		TreeNode last=pRoot;
		while(!nodes.isEmpty()) {
			last=nodes.get(nodes.size()-1);
			ArrayList<Integer> list=new ArrayList<>();
			TreeNode node=nodes.poll();
			while(node!=last) {
				list.add(node.val);
				if(node.left!=null) nodes.add(node.left);
				if(node.right!=null) nodes.add(node.right);
				node=nodes.poll();
			}
			list.add(node.val);
			if(node.left!=null) nodes.add(node.left);
			if(node.right!=null) nodes.add(node.right);
			res.add(list);
		}
		return res;
    }
}
