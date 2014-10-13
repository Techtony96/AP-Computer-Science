package me.Techtony96.Utilities;

public class Circle {
	
	private double r;	//Radius
	
	public Circle(double r){
		this.r = r;
	}
	
	public double getRadius(){
		return r;
	}
	
	public double getArea(){
		return Math.PI*r*r;
	}
	
	public double getCircumference(){
		return Math.PI*2*r;
	}
	
	public double getDiameter(){
		return r*2;
	}

}
