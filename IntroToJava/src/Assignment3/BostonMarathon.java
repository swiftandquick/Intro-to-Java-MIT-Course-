package Assignment3;

public class BostonMarathon {

	public static void main(String args[]) {
		
		int fastest = 0; 
		int secondFastest = 0;
		
		String name [] = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", 
				"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
		};
		
		int Time [] = { 341, 273, 278, 329, 445, 402, 388, 275, 
				243, 334, 412, 393, 299, 343, 317, 265
		};
		
		for(int i = 0; i < Time.length; i++) {
			if (Time[i] < Time[fastest]) {
				fastest = i;
			}
			else if (Time[i] > Time[fastest] && Time[i] < Time[secondFastest]) {
				secondFastest = i;
			}
		}
		
		System.out.println("Fastest runner is " + name[fastest] + " in " + Time[fastest] + " minutes.  "); 
		System.out.println("Second fastest runner is " + name[secondFastest] + " in " + Time[secondFastest] + " minutes.  "); 
		
	}
	
}
