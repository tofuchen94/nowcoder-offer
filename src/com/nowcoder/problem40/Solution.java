package com.nowcoder.problem40;

import java.util.ArrayList;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 * @author tofuchen
 *
 */
public class Solution {
	
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int temp=0;
        for(int num:array) {
        	temp=temp^num;
        }
        int i=1;
        while((i&temp)==0) {
        	i=i<<1;
        }
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int num:array) {
        	if((num&temp)>0) {
        		list1.add(num);
        	}else {
        		list2.add(num);
        	}
        }
        int res1=0;
        for(int num:list1) {
        	res1=res1^num;
        }
        num1[0]=res1;
        int res2=0;
        for(int num:list1) {
        	res2=res2^num;
        }
        num2[0]=res2;
    }
}