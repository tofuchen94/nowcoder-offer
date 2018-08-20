package com.nowcoder.problem24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.nowcoder.domain.TreeNode;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @author tofuchen
 *
 */
public class Solution {
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> path=new ArrayList<>();
        if(root==null)return res;
		helper(res,path,root,0,target);
		Collections.sort(res, new Comparator<ArrayList>() {
			@Override
			public int compare(ArrayList o1, ArrayList o2) {
				return o2.size()-o1.size();
			}
		});
		return res;
	}
	
	public void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> path,TreeNode node,int sum,int target) {
		if(node.left==null&&node.right==null) {
			if(sum+node.val==target) {
				ArrayList<Integer> temp=new ArrayList<Integer>(path);
				temp.add(node.val);
				res.add(temp);
				return;
			}else {
				return;
			}
		}
		path.add(node.val);
		if(node.left!=null) {
			helper(res,path,node.left,sum+node.val,target);
		}
		if(node.right!=null) {
			helper(res,path,node.right,sum+node.val,target);
		}
		path.remove(path.size()-1);
	}

}
