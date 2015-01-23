package me.Techtony96.QuarterThree.Week20.OOD;

class DVDPlayer {
	boolean canRecord = false;

	public void recordDVD() { //Added public
		System.out.println("DVD recording");
	}
	
	public void playDVD(){
		//Added method
	}
}

class DVDPlayerTestDrive {
	public static void main(String[] args) { //DVDPlayer does not have method playDVD
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}