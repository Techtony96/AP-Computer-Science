package me.Techtony96.FinalProject.Buttons;

import me.Techtony96.FinalProject.BaffleBoxManager;
import me.Techtony96.FinalProject.Buttons.types.TextButton;

public class HistoryButton extends TextButton {

	
	//Implementation of TextButton
	public HistoryButton() {
		super(0.5, 115, 14.5, 118);
	}

	//Method called when this button is clicked
	@Override
	public void action() {
		BaffleBoxManager.getGame().displayHistory();
	}

}
