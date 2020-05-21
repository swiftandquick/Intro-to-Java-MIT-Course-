package Assignment2;

public class FooCorporation {

	private static void payment(int id, double basePay, int hours) {
		if (hours <= 40) {
			System.out.println("Employee " + id + "'s salary is $" + (basePay * hours) + ".  ");
		} else if (hours >= 40 && hours <= 60) {
			double totalPay = basePay * 40 + basePay * (hours - 40) * 1.5;
			System.out.println("Employee " + id + "'s salary is $" + totalPay + ".  ");
		} else {
			System.out.println("Employee " + id + " worked more than 60 hours!  ");
		}
	}

	public static void main(String args[]) {

		payment(1, 7.5, 35);
		payment(2, 8.2, 47);
		payment(3, 10, 73);

	}

}
