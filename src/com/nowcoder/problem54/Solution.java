package com.nowcoder.problem54;

import java.util.HashMap;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		Solution s=new Solution();
		char[] chs="google".toCharArray();
		for(char ch:chs) {
			s.Insert(ch);
			System.out.println(s.FirstAppearingOnce());
		}
	}
	
	HashMap<Character,Integer> map=new HashMap<>();
	private int index=0;
	
	//Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)) {
        	map.put(ch, -1);
        }else {
        	map.put(ch, index);
        }
        index++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	int min=Integer.MAX_VALUE;
    	char res='#';
    	for(Character ch:map.keySet()) {
    		if(map.get(ch)>=0&&map.get(ch)<min) {
    			res=ch;
    			min=map.get(ch);
    		}
    	}
    	return res;
    }

}
