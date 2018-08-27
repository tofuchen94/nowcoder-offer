package com.nowcoder.problem61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.nowcoder.domain.TreeNode;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		String str="8,6,10,5,7,9,11";
		Solution s=new Solution();
		System.out.println(s.Serialize(s.Deserialize(str)));
	}

	String Serialize(TreeNode root) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		ArrayList<String> list=new ArrayList<>();
		if(root==null)return "#";
		queue.add(root);
		list.add(String.valueOf(root.val));
		while(!queue.isEmpty()) {
			TreeNode node=queue.poll();
			if(node.left!=null) {
				queue.add(node.left);
				list.add(String.valueOf(node.left.val));
			}else {
				list.add("#");
			}
			if(node.right!=null) {
				queue.add(node.right);
				list.add(String.valueOf(node.right.val));
			}else {
				list.add("#");
			}
		}
		StringBuilder res=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			res.append(list.get(i));
			if(i!=list.size()-1) {
				res.append(",");
			}
		}
		return res.toString();
	}

	TreeNode Deserialize(String str) {
		if(str==null||str.charAt(0)=='#')return null;
		String[] strs=str.split(",");
		int index=1;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode root=new TreeNode(Integer.valueOf(strs[0]));
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node=queue.poll();
			if(index<strs.length&&!strs[index].equals("#")) {
				TreeNode left=new TreeNode(Integer.valueOf(strs[index]));
				node.left=left;
				queue.add(left);
			}
			index++;
			if(index<strs.length&&!strs[index].equals("#")) {
				TreeNode right=new TreeNode(Integer.valueOf(strs[index]));
				node.right=right;
				queue.add(right);
			}
			index++;
		}
		return root;
	}

}
