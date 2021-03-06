package me.Techtony96.QuarterThree.Week28.classes;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	//System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/
	public static void testZeroBlue() {
		Picture beach = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	public static void testNegate() {
		Picture beach = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}
	
	public static void testGrayscale() {
		Picture beach = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/caterpillar.jpg");
	//	caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	public static void testMyCollage() {
		Picture canvas = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture(System.getProperty("user.dir") + "/src/me/Techtony96/QuarterThree/Week28/images/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		//testKeepOnlyBlue();
		//testKeepOnlyRed();
		//testKeepOnlyGreen();
		//testNegate();
		//testGrayscale();
		//testFixUnderwater();
		//testMirrorVertical();
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testMirrorDiagonal();
		//testMyCollage();
		//testCopy();
		testEdgeDetection();
		//testEdgeDetection2();
		//testChromakey();
		//testEncodeAndDecode();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
	}
}