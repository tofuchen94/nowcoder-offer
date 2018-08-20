package com.nowcoder.problem19;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(new Solution().printMatrix(matrix).toString());
	}
	
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		int l=Math.min(matrix.length, matrix[0].length);
		int num=0;
		if(l%2==0)num=l/2;
		else num=l/2+1;
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int k=0;k<num;k++) {
			helper(res,matrix,k);
		}
		return res;
	}
	
	private void helper(ArrayList<Integer> res,int[][] matrix,int k) {
		if(k==matrix.length-1-k) {
			for(int j=k;j<matrix[0].length-k;j++) {
				res.add(matrix[k][j]);
			}
			return;
		}
		if(k==matrix[0].length-1-k) {
			for(int j=k;j<matrix.length-k;j++) {
				res.add(matrix[j][k]);
			}
			return;
		}
		
		//向右
		for(int i=k;i<matrix[0].length-k;i++) {
			res.add(matrix[k][i]);
		}
		//向下
		for(int i=k+1;i<matrix.length-k;i++) {
			res.add(matrix[i][matrix[0].length-1-k]);
		}
		//向左
		for(int i=matrix[0].length-k-2;i>k-1;i--) {
			res.add(matrix[matrix.length-k-1][i]);
		}
		//向上
		for(int i=matrix.length-2-k;i>k;i--) {
			res.add(matrix[i][k]);
		}
		return;
		
	}

}
