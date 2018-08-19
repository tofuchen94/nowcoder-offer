package com.nowcoder.problem6;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 
 * @author CDF
 *
 */
public class Solution {
	public int minNumberInRotateArray(int[] array) {
		if(array.length==0)return 0;
		if(array.length==1)return array[0];
		return helper(array,0,array.length-1);
	}
	
	private int helper(int[] array,int left,int right){
		if(left==right)return array[left];
		int mid=(left+right)/2;
		if(array[mid]<array[right]){
			right=mid;
			return helper(array,left,right);
		}else if(array[mid]>array[left]){
			left=mid+1;
			return helper(array,left,right);
		}else{
			left++;
			return helper(array,left,right);
		}
	}
}
