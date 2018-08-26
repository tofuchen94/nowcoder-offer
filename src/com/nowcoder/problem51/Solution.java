package com.nowcoder.problem51;

import java.util.Arrays;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[] res=new Solution().multiply(new int[] {1,2,3,4,5});
		System.out.println(Arrays.toString(res));
	}
	
    public int[] multiply(int[] A) {
    	if(A==null||A.length==0) {
    		int[] res= {};
    		return res;
    	}
    	int[][] AA=new int[A.length][A.length];
    	for(int i=0;i<A.length;i++) {
    		AA[i][i]=A[i];
    		for(int l=1;i+l<A.length;l++) {
    			AA[i][l+i]=AA[i][l+i-1]*A[l+i];
    		}
    	}
    	int[] res=new int[A.length];
    	Arrays.fill(res, 1);
    	for(int i=0;i<A.length;i++) {
    		if(i-1>=0) {
    			res[i]*=AA[0][i-1];
    		}
    		if(i+1<A.length) {
    			res[i]*=AA[i+1][A.length-1];
    		}
    	}
    	return res;
    	
    }
}