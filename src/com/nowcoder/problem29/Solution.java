package com.nowcoder.problem29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] input= {4,5,1,6,2,7,3,8};
		System.out.println(new Solution().GetLeastNumbers_Solution(input, 4));
	}
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		if(k>input.length||k==0)return new ArrayList<Integer>();
        PriorityQueue<Integer> queue=new PriorityQueue<>(k, new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1, Integer o2) {
        		// TODO Auto-generated method stub
        		return o1-o2;
        	}
		});
        for(int i=0;i<input.length;i++) {
        	queue.add(input[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++)
        res.add(queue.poll());
        return res;
    }

}
