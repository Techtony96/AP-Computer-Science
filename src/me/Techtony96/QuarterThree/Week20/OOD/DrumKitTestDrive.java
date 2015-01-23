package me.Techtony96.QuarterThree.Week20.OOD;

class DrumKitTestDrive {

	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		if (d.snare == true) {
			
			d.playSnare();
			
		}
		d.playTopHat();
	}

}

class DrumKit {

	boolean topHat = true;
	boolean snare = true;

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}
/*
Sample Output:

bang bang ba-bang
ding ding da-ding


*/