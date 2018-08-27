package com.nowcoder.problem65;
/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。 
 * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		char[] matrix= {'a','b','c','e','s','f','c','s','a','d','e','e'};
//		char[] str= {'b','c','c','e','d'};
		char[] str= {'a','b','c','b'};
		System.out.println(new Solution().hasPath(matrix, 3, 4, str));
	}
	
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
		if(matrix==null||matrix.length!=rows*cols)return false;
		int[][] temp=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(helper(matrix,temp,i,j,str,0))return true;
			}
		}
		return false;
    }
	
	public boolean helper(char[] matrix,int[][] temp,int i,int j,char[] str,int index) {
		if(temp[i][j]==1)return false;
		if(matrix[i*temp[0].length+j]!=str[index])return false;
		if(index==str.length-1)return true;
		temp[i][j]=1;
		if(i>0&&helper(matrix,temp,i-1,j,str,index+1))return true;
		if(j<temp[0].length-1&&helper(matrix,temp,i,j+1,str,index+1))return true;
		if(i<temp.length-1&&helper(matrix,temp,i+1,j,str,index+1))return true;
		if(j>0&&helper(matrix,temp,i,j-1,str,index+1))return true;
		temp[i][j]=0;
		return false;
	}
}
