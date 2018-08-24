package com.nowcoder.problem42;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author tofuchen
 *
 */
public class Solution {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        res.add(0);
		int min=Integer.MAX_VALUE;
		int left=0,right=array.length-1;
		while(left<right) {
			int temp=array[left]+array[right];
			if(temp==sum) {
				if(array[left]*array[right]<min) {
					min=array[left]*array[right];
					res.set(0, array[left]);
					res.set(1, array[right]);
				}
				left++;
				right--;
			}else if(temp<sum){
				left++;
			}else {
				right--;
			}
		}
		if(min==Integer.MAX_VALUE) {
			res.remove(res.size()-1);
			res.remove(res.size()-1);
		}
		return res;
        
    }
}
