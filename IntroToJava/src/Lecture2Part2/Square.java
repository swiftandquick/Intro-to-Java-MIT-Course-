package Lecture2Part2;

public class Square {

	public static void printSquare(int x) {
		System.out.println("The square's are is:  " + x * x);
	}
	
	public static double returnSquare(int x) {
		return x * x;
	}
	
	public static void main(String args[]) {
		
		int side = 2;		
		printSquare(side);
		printSquare(3);
		
		System.out.println(returnSquare(side));
		
	}
	
}
