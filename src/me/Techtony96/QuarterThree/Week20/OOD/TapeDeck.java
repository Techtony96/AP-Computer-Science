package me.Techtony96.QuarterThree.Week20.OOD;

class TapeDeck {
	boolean canRecord = false;

	public	void playTape() { 	//added public
 System.out.println("tape playing");
 }

public	void recordTape() {	//added public
 System.out.println("tape recording");
 }
}

class TapeDeckTestDrive {
	public static void main(String[] args) {	//did not create TapeDeck object t
		TapeDeck t = new TapeDeck();	//added
		t.canRecord = true;
		t.playTape();
		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}