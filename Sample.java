package com.onesoft.collections;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		System.out.println(nums);
		nums.set(1, 9);
		System.out.println(nums);
		nums.remove(3);
		System.out.println(nums);
		System.out.println(nums.get(3));
		System.out.println(nums.size());
		nums.add(3,7);
		System.out.println(nums);
		nums.set(3, 8);
		System.out.println(nums);
		nums.remove(3);
		System.out.println(nums);
	}

}
