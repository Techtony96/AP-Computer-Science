package me.Techtony96.Utilities;

public class Round {
	
	public static double round(double number, double place){
		return (int)(number*place + .5)/place;
	}
	
	public static double tenths(double number){
		return (int)(number*10.0 + .5)/10.0;
	}
	
	public static double hundredths(double number){
		return (int)(number*100.0 + .5)/100.0;
	}
	
	public static double thousandths(double number){
		return (int)(number*1000.0 + .5)/1000.0;
	}

}
