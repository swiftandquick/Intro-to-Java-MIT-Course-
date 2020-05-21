package Lecture2Part1;

public class NewLine {

	/** Static methods can only refer to other static methods.  */
	public static void newLine() {
		System.out.println();
	}

	/** Static methods can only refer to other static methods.  
	 * threeNewLines method calls newLine method three times.  */
	public static void threeNewLines() {
		newLine();
		newLine(); 
		newLine(); 
	}
	
	/** Main method calls threeNewLines() method.  */
	public static void main(String args[]) {
		System.out.println("First line!  ");
		threeNewLines();
		System.out.println("Last line!  ");
	}
	
}
