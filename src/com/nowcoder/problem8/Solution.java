package com.nowcoder.problem8;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author CDF
 *
 */
public class Solution {
    public int JumpFloor(int target) {
        if(target==0)return 1;
		if(target==1)return 1;
		int a=1;
		int b=1;
		for(int i=2;i<=target;i++){
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;
    }
}
