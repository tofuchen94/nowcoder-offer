package com.nowcoder.problem36;
/**
 * 统计一个数字在排序数组中出现的次数
 * @author tofuchen
 *
 */
public class Solution {
	
	public int GetNumberOfK(int [] array , int k) {
		int left=getFirstK(array, k);
		int right=getLastK(array, k);
		if(left==-1||right==-1)return 0;
		return right-left+1;
    }
	
	private int getFirstK(int[] array,int k) {
		int left=0;
		int right=array.length-1;
		while(left<=right) {
			int mid=(left+right)>>1;
			if(array[mid]<k) {
				left=mid+1;
			}else if(array[mid]>k){
				right=mid-1;
			}else {
				if(mid>0&&array[mid-1]!=k||mid==0) {
					return mid;
				}else {
					right=mid-1;
				}
			}
		}
		return -1;
	}
	
	private int getLastK(int[] array,int k) {
		int left=0;
		int right=array.length-1;
		while(left<=right) {
			int mid=(left+right)>>1;
			if(array[mid]<k) {
				left=mid+1;
			}else if(array[mid]>k){
				right=mid-1;
			}else {
				if(mid<array.length-1&&array[mid+1]!=k||mid==array.length-1) {
					return mid;
				}else {
					left=mid+1;
				}
			}
		}
		return -1;
	}

}
