package com.nowcoder.problem66;
/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 * @author tofuchen
 *
 */
public class Solution {
	
	public int movingCount(int threshold, int rows, int cols){
        int[][] temp=new int[rows][cols];
        return helper(0,0,temp,threshold);
    }
	
	private int helper(int i,int j,int[][] temp,int threshold) {
		if(i<0||j<0||i>=temp.length||j>=temp[0].length||temp[i][j]==1||sum(i,j)>threshold)return 0;
		temp[i][j]=1;
		return helper(i-1,j,temp,threshold)+helper(i+1,j,temp,threshold)
		+helper(i,j-1,temp,threshold)+helper(i,j+1,temp,threshold)+1;
	}
	
	private int sum(int num1,int num2) {
		int res=0;
		while(num1>0) {
			res+=num1%10;
			num1=num1/10;
		}
		while(num2>0) {
			res+=num2%10;
			num2=num2/10;
		}
		return res;
	}
}
