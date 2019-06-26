package com.fusi24;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle(double width, double length, String color, Boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	@Override
	public double getArea() {
		return this.width*this.length;
	}
	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Rectangle[width ="+this.width+",length ="+this.length+",color = "+this.color+",filled ="+this.filled+", area ="+getArea()+",parameter ="+getParameter()+"]");
	}

	
}
