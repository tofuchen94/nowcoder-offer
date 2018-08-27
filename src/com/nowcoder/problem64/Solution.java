package com.nowcoder.problem64;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author tofuchen
 *
 */
public class Solution {
	
	public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(num==null||num.length<size||size==0)return res;
        LinkedList<Integer> index=new LinkedList<Integer>();
        for(int i=0;i<size-1;i++) {
        	while(!index.isEmpty()&&num[i]>num[index.getLast()]) {
        		index.removeLast();
        	}
        	index.add(i);
        }
        for(int i=size-1;i<num.length;i++) {
        	while(!index.isEmpty()&&num[i]>num[index.getLast()]) {
        		index.removeLast();
        	}
        	index.add(i);
        	while(i-index.getFirst()+1>size)index.removeFirst();
        	res.add(num[index.getFirst()]);
        }
        return res;
    }

}
