package com.nowcoder.problem43;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 
 * @author tofuchen
 *
 */
public class Solution {

	public String LeftRotateString(String str, int n) {
		if(n==0||str==null||str.length()<=1)return str;
		n=n%str.length();
		StringBuilder res=new StringBuilder();
		for(int i=n;i<str.length();i++) {
			res.append(str.charAt(i));
		}
		for(int i=0;i<n;i++) {
			res.append(str.charAt(i));
		}
		return res.toString();
	}

}
