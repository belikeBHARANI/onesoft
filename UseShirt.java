package com.onesoft.collections;

import java.util.ArrayList;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1 = new Shirt();
		s1.setBrand("Basics");
		s1.setColor("Red");
		s1.setSize('L');
		s1.setType("Checked");
		s1.setPrice(2000);
		Shirt s2 = new Shirt();
		s2.setBrand("White");
		s2.setColor("DXMN");
		s2.setSize('L');
		s2.setType("Plain");
		s2.setPrice(600);
		Shirt s3 = new Shirt();
		s3.setBrand("Sandal");
		s3.setColor("Buffallo");
		s3.setSize('L');
		s3.setType("Printed");
		s3.setPrice(2500);
		Shirt s4 = new Shirt();
		s4.setBrand("Blue");
		s4.setColor("Colours");
		s4.setSize('M');
		s4.setType("Strips");
		s4.setPrice(1500);
		Shirt s5 = new Shirt();
		s5.setBrand("Brown");
		s5.setColor("Umbro");
		s5.setSize('M');
		s5.setType("Big Box");
		s5.setPrice(1000);

		ArrayList<Shirt> shirts = new ArrayList<>();
		shirts.add(s1);
		shirts.add(s2);
		shirts.add(s3);
		shirts.add(s4);
		shirts.add(s5);
		ArrayList<Shirt> mSize = new ArrayList<>();
		ArrayList<Shirt> lSize = new ArrayList<>();
		ArrayList<Shirt> redColor = new ArrayList<>();

		// Seperate M size;
		for (Shirt x : shirts) {
			if (x.getSize() == 'M') {
				mSize.add(x);
			}
		}

		//mSize.forEach(z->System.out.println(z.getColor()+","+z.getBrand()+","+z.getSize()+","+z.getPrice()+","+z.getType()));

		// Seperate L size;
		for (Shirt x : shirts) {
			if (x.getSize() == 'L') {
				lSize.add(x);
			}
		}

		//lSize.forEach(z -> System.out.println(z.getColor() + "," + z.getBrand() + "," + z.getSize() + "," + z.getPrice() + "," + z.getType()));

		// Separate Red color;
		for (Shirt x : shirts) {
			if (x.getColor().equalsIgnoreCase("red") && x.getType().equalsIgnoreCase("Checked")) {
				redColor.add(x);
			}
		}
		redColor.forEach(z -> System.out.println(
				z.getColor() + "," + z.getBrand() + "," + z.getSize() + "," + z.getPrice() + "," + z.getType()));

	}
	

}
