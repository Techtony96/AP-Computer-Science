package me.Techtony96.FinalProject.Buttons.types;

import me.Techtony96.FinalProject.Resources.StdDraw;

public abstract class TextButton extends BaffleButton {
	
	double x1, x2, y1, y2;
	
	//Create a text rectangle/Button with the X,Y cords
	public TextButton(double x1, double y1, double x2, double y2){
		super(x1, y1);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		StdDraw.rectangle(x1, y1, x2 - x1, y2 - y1);
	}
	
	public boolean inside(double x, double y){
		if (x >= x1 && x <= x2 && y >= y1 && y <= y2)
			return true;
		return false;
	}
	
	public abstract void action();

}
