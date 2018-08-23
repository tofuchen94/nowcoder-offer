package com.nowcoder.problem32;
/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @author tofuchen
 *
 */
public class Solution {
	
	public int GetUglyNumber_Solution(int index) {
		if(index==0)return 0;
        int[] nums=new int[index];
        nums[0]=1;
        int p2=0,p3=0,p5=0;
        for(int i=1;i<index;i++) {
        	int min=Math.min(2*nums[p2],3*nums[p3]);
        	min=Math.min(min, 5*nums[p5]);
        	nums[i]=min;
        	if(min==2*nums[p2])p2++;
        	if(min==3*nums[p3])p3++;
        	if(min==5*nums[p5])p5++;
        }
        return nums[index-1];
    }

}
