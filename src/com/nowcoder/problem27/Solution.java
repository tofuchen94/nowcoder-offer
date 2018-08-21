package com.nowcoder.problem27;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		String str="abc";
		System.out.println(new Solution().Permutation(str));
	}
	
	public ArrayList<String> Permutation(String str) {
		char[] chars=str.toCharArray();
		Arrays.sort(chars);
		int[] key=new int[chars.length];
		ArrayList<Character> strs=new ArrayList<>();
		ArrayList<String> res=new ArrayList<>();
		helper(chars,key,strs,res);
		return res;
    }
	
	private void helper(char[] chars,int[] key,ArrayList<Character> str,ArrayList<String> res) {
		for(int i=0;i<chars.length;i++) {
			if(key[i]==0) {
				if(i>0&&chars[i-1]==chars[i]&&key[i-1]==0) {
					continue;
				}else {
					if(str.size()==chars.length-1) {
						res.add(toString(str,chars[i]));
						break;
					}else {
						str.add(chars[i]);
						key[i]=1;
						helper(chars,key,str,res);
						key[i]=0;
						str.remove(str.size()-1);
					}
				}
			}
		}
	}
	
	private String toString(ArrayList<Character> str,char ch) {
		StringBuilder res=new StringBuilder();
		for(char c:str) {
			res.append(c);
		}
		res.append(ch);
		return res.toString();
	}

}
