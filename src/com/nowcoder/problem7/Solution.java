package com.nowcoder.problem7;
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 * @author CDF
 *
 */
public class Solution {
	
	public int Fibonacci(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		int a=0;
		int b=1;
		for(int i=2;i<=n;i++){
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;

    }
}
