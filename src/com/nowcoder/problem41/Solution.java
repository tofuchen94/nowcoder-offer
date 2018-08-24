package com.nowcoder.problem41;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * @author tofuchen
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		System.out.println(new Solution().FindContinuousSequence(100));
	}
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		int left=1,right=2;
		while(left<right) {
			int temp=(left+right)*(right-left+1)/2;
			if(temp==sum) {
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=left;i<=right;i++) {
					list.add(i);
				}
				res.add(list);
				left++;
			}else if(temp<sum) {
				right++;
			}else {
				left++;
			}
		}
		return res;
    }

}
