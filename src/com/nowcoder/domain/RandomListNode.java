package com.nowcoder.domain;

public class RandomListNode {
    public int label;
    public RandomListNode next = null;
    public RandomListNode random = null;

    public RandomListNode(int label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
    	StringBuilder res=new StringBuilder();
    	res.append(label);
    	RandomListNode node=this.next;
    	while(node!=null) {
    		res.append(","+node.label);
    		node=node.next;
    	}
    	return res.toString();
    }
}