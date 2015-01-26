package me.Techtony96.QuarterThree.Week21.Monday;

public class Number {
	
	private int number;
	public Number(int num){
		this.number = num;
	}
	
	public void setNumber(int num){
		this.number = num;
	}
	
	public int getUnits() {
		return number % 10;
	}
	
	public int getTens(){
		return number % 100 / 10;
	}
	
	public int getHundreds(){
		return number % 1000 / 100;
	}

}
