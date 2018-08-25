package com.nowcoder.problem49;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 * 
 * @author tofuchen
 *
 */
public class Solution {
	public int StrToInt(String str) {
		if(str==null||str.length()==0)return 0;
		if(str.length()==1&&!isNum(str.charAt(0)))return 0;
		boolean isZhen=true;
		int res=0;
		char ch=str.charAt(0);
		if(ch=='-')isZhen=false;
		else if(ch=='+')isZhen=true;
		else if(!isNum(ch))return 0;
		else res=ch-'0';
		for(int i=1;i<str.length();i++) {
			ch=str.charAt(i);
			if(!isNum(ch))return 0;
			res=res*10+ch-'0';
		}
		if(isZhen)return res;
		return -res;

	}
	
	private boolean isNum(char ch) {
		if(ch>'0'&&ch<='9')return true;
		else return false;
	}
}
