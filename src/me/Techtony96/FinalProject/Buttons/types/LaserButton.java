package me.Techtony96.FinalProject.Buttons.types;


public class LaserButton extends BaffleButton {
	
	private int spot;
	
	//Spot ID and X,Y cords
	public LaserButton(int spot, double x, double y){
		super(x, y);
		this.spot = spot;
		
	}
	
	public int getSpot(){
		return spot;
	}
	
	
	

}
