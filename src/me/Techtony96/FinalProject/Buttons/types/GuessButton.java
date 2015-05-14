package me.Techtony96.FinalProject.Buttons.types;

import me.Techtony96.FinalProject.Enums.Baffle;
import me.Techtony96.FinalProject.Resources.StdDraw;

public class GuessButton extends BaffleButton{
	
	//Each square has one of these. This is used to store which baffle is where, and to check if a user has already guessed it.
	double x, y;
	Baffle baf;
	boolean guessed = false;
	
	public GuessButton(double x, double y, Baffle baf){
		super(x, y);
		this.x = x;
		this.y = 90 - y;
		this.baf = baf;
	}
	
	//check if the cords are inside this sqauare
	public boolean isInside(double x, double y){
		if (this.x <= x && this.x + 10 >= x && this.y <= y && this.y + 10 >= y){
			return true;
		}
			
		return false;
	}
	
	public Baffle getBaffle(){
		return baf;
	}
	
	public boolean isGuessed(){
		return guessed;
	}
	
	public void setGuessed(){
		guessed = true;
	}
	
	//draw the baffle on the board
	public void drawBaffle(){
		if (baf == Baffle.POS) {
			StdDraw.line(x , y, x + 10, y + 10);
		} else {
			StdDraw.line(x , y + 10, x + 10, y);
		}
	}

}
