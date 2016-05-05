package arithmeticExpressionsExapmles;

public class Randoms {

	public static void main(String[] args) {
		//Randomise an int number between 1-100.
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		System.out.println("a = " + a + ", b = " + b);

		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

		double avg = (a + b) / 2D;
		System.out.println("average: " + avg);

		int rem = a % 10;
		System.out.println("remainder of " + a + " divided by 10 = " + rem);
		rem = b % 10;
		System.out.println("remainder of " + b + " divided by 10 = " + rem);

		int area = a * b;
		System.out.println("area of rectangle " + a + " X " + b + " = " + area);

	}

}
