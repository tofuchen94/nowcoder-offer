package com.nowcoder.problem13;

import java.util.Arrays;

/**
 * 
 *输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author tofuchen
 *
 */
public class Solution {

	public void reOrderArray(int[] array) {
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(!isEven(array[i])) {
				insert(array,index,i);
				index++;
			}
		}
	}
	
	private void insert(int[] array,int i,int j) {
		int k=j;
		int temp=array[j];
		while(k>i) {
			array[k]=array[k-1];
			k--;
		}
		array[k]=temp;
	}
	
	private boolean isEven(int num) {
		if(num%2==0)return true;
		return false;
	}

}
