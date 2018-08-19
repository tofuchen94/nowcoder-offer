package com.nowcoder.problem2;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author CDF
 *
 */

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().replaceSpace(new StringBuffer("we are family")));
	}

	public String replaceSpace(StringBuffer str) {
		String temp=str.toString();
		return temp.replaceAll(" ", "%20");
	}

}
