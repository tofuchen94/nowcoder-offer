package com.nowcoder.problem31;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * 
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().NumberOf1Between1AndN_Solution(13));
	}
	
	public int NumberOf1Between1AndN_Solution(int n) {
		int pre=0;
		int i=1;
		int after=0;
		int num=0;
		int res=0;
		while(n/i!=0) {
			pre=n/(i*10);
			after=n-(n/i)*i;
			num=(n/i)%10;
			if(num==0) {
				res=res+pre*i;
			}else if(num==1) {
				res=res+pre*i+after+1;
			}else {
				res=res+(pre+1)*i;
			}
			i*=10;
		}
		return res;
	}

}
