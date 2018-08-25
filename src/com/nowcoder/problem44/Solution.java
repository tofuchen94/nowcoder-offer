package com.nowcoder.problem44;

/**
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		String str="student. a am I";
		System.out.println(new Solution().ReverseSentence(str));
	}

	public String ReverseSentence(String str) {
		char[] array=str.toCharArray();
		for(int left=0;left<array.length;) {
			while(left<array.length&&array[left]==' ')left++;
			if(left<array.length) {
				int right=findRight(array, left);
				helper(array,left,right);
				left=right+1;
			}
		}
		helper(array,0,array.length-1);
		return new String(array);
	}
	
	private int findRight(char[] array,int left) {
		int i=left;
		while(i<array.length&&array[i]!=' ') {
			i++;
		}
		return i-1;
	}
	
	private void helper(char[] array,int left,int right) {
		int i=left;
		int j=right;
		while(i<j) {
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
	}

}
