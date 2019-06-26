package com.fusi24;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String shapeType;
	double radius,width,length;
	String color;
	Boolean filled;
	
	System.out.println("Selamat Datang di Program Kalulator Shape");
	System.out.print("Pilih Shape: ");
	shapeType = in.next();
	
	switch(shapeType) {
	case "circle":
		System.out.print("Masukan Radius: ");
		radius = in.nextDouble();
		System.out.print("Masukan Color: ");
		color = in.next();
		System.out.print("Filled? let it blank if false: ");
		filled = in.hasNext("yes");
		Shape circle = new Cirle(radius,color,filled);
		System.out.println(circle.toString());
		
	case "rectangle":
		System.out.print("Masukan Panjang: ");
		length = in.nextDouble();
		System.out.print("Masukan Lebar: ");
		width = in.nextDouble();
		System.out.print("Masukan color: ");
		color = in.next();
		System.out.print("Filled? let it blank if false: ");
		filled = in.hasNext("yes");
		Shape rectangle = new Rectangle(width,length,color,filled);
		System.out.println(rectangle.toString());
		
	}
	}

}
