package com.nowcoder.problem20;

import java.util.ArrayList;
/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 * @author tofuchen
 *
 */
public class Solution {
	
	private ArrayList<Integer> numlist=new ArrayList<Integer>();
	private ArrayList<Integer> minlist=new ArrayList<Integer>();
	
	public void push(int node) {
		numlist.add(node);
		if(minlist.isEmpty()||node<minlist.get(minlist.size()-1)) {
			minlist.add(node);
		}else {
			minlist.add(minlist.get(minlist.size()-1));
		}
	}

	public void pop() {
		numlist.remove(numlist.size()-1);
		minlist.remove(minlist.size()-1);
	}

	public int top() {
		return numlist.get(numlist.size()-1);
	}

	public int min() {
		return minlist.get(minlist.size()-1);
	}
}
