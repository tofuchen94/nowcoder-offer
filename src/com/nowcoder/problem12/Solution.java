package com.nowcoder.problem12;
/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 * @author CDF
 *
 */
public class Solution {
	
	public double Power(double base, int exponent) {
		if(exponent==0)return (double)1;
		if(exponent==1)return base;
		if(exponent<0)return 1/Power(base,-exponent);
		if(exponent%2==0){
			double temp=Power(base,exponent/2);
			return temp*temp;
		}else{
			double temp=Power(base,exponent/2);
			return temp*temp*base;
		}
	}

}
