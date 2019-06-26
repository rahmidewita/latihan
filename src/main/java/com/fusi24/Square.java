package com.fusi24;

public class Square extends Shape {
	protected double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void Square(double side, double length, String color, Boolean filled) {
		this.side = side;
		this.color = color;
		this.filled = filled;
}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return ("Square[side ="+this.side+",color = "+this.color+",filled ="+this.filled+", area ="+getArea()+",parameter ="+getParameter()+"]");
	}

}
