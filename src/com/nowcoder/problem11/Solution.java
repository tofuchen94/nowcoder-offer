package com.nowcoder.problem11;
/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author CDF
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().NumberOf1(-2));
	}
	
	public int NumberOf1(int n) {
		int res=0;
		while(n!=0){
			if((n&1)!=0)res++;
			n=n>>>1;
		}
		return res;
    }
}
