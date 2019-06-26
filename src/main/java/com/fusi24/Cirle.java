package com.fusi24;

public class Cirle extends Shape{

	protected double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		
	}
	public Cirle(double radius, String color, Boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius*this.radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Circle[radius ="+this.radius+",color = "+this.color+",filled ="+this.filled+", area ="+getArea()+",parameter ="+getParameter()+"]");
	}

	
	
}
