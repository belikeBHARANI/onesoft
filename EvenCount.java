package com.onesoft.collections;

import java.util.ArrayList;

public class EvenCount {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		
		int count=0;
		
		for(Integer x:nums) {
			if(x%2==0) {
				count++;
			}
		
		}
		System.out.println("Count - "+count);
	
	

}

}
