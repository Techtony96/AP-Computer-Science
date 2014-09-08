package me.Techtony96;

import java.util.ArrayList;
import java.util.List;

public enum BlockLetters {
	TONY_PAPPAS(TonyPappas(), "Tony Pappas");
	
	private List<String> currentList = new ArrayList<String>();
	private String name = "";
	
	
	BlockLetters(List<String> list, String name){
		this.currentList = list;
		this.name = name;
	}
	
	
	public List<String> getList(){
		return currentList;
	}
	
	public String getStringName(){
		return name;
	}
	
	public void outputStringName(){
		System.out.println(name);
	}
	
	public void outputBlockName(){
		for (String s : currentList){
			System.out.println(s);
		}

	}
	
	
	
	

	
	
	
	
	private static List<String> TonyPappas() {
		List<String> TonyPappas = new ArrayList<String>();
		TonyPappas.add(" ");
		TonyPappas.add(" _____                   ____                              ");
		TonyPappas.add("|_   _|__  _ __  _   _  |  _ \\ __ _ _ __  _ __   __ _ ___  ");
		TonyPappas.add("  | |/ _ \\| '_ \\| | | | | |_) / _` | '_ \\| '_ \\ / _` / __| ");
		TonyPappas.add("  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \\__ \\ ");
		TonyPappas.add("  |_|\\___/|_| |_|\\__, | |_|   \\__,_| .__/| .__/ \\__,_|___/ ");
		TonyPappas.add("                 |___/             |_|   |_|               ");
		TonyPappas.add(" ");
		return TonyPappas;
	}
}
