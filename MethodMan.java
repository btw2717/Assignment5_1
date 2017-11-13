import java.util.Scanner;

/**
 * The MethodMan class uses a set of private static doubles to use within methods created to perform mathematical functions. This class implements a variety of static methods within the main() method.
 * @author sapper
 * email: email
 * Created 12NOV2017
 * @version 1.0
 */

public class MethodMan {

	private static double product=1, newBase=1, root, sum;

	/**
	 * The powerTen() method takes a double to the tenth power.
	 * @param base The base double which will be taken to the tenth power.
	 * @return product the base double raised to the tenth power
	 */
	
		public static double powerTen(double base) {
			for (int i=0; i<10; i++) {
				product = product * base;
			}
			return product;
			}

		/**
		 * The addTwo() method adds two double values together.
		 * @param x a double value
		 * @param y a double value
		 * @return sum the sum of the two double values
		 */

		public static double addTwo(double x, double y) {
			sum = x + y;
			return sum;
		}

		/**
		 * The abs() method finds the absolute value of a double.
		 * @param num a double value
		 * @return returns num if greater than zero, else returns the equivalent positive double of a negative double value.
		 */

		public static double abs(double num) {
			if (num >= 0) {
				return num;
			} else {
				return num - (2*num);
			}
		}

		/**
		 * The squirt() method finds the square root of a double.
		 * @param radicand a double value for which the square will be found
		 * @return squareRoot The square root of the radicand double parameter.
		 */

		public static double squirt(double radicand) {
			double t;
			double squareRoot = radicand / 2;
			do {
				t = squareRoot;
				squareRoot = (t + (radicand / t)) / 2;
			} while ((t - squareRoot) !=0);
			return squareRoot;
		}

		/**
		 * The power() method takes one double value to the power of a second double value.
		 * @param varBase The base double value
		 * @param varExp The exponent double value
		 * @return newBase The product of the base multiolied by itself varExp times.
		 */

		public static double power(double varBase, double varExp) {
			int c = 1;
			while (c <= varExp) {
				newBase = newBase * varBase;
				c++;
			}
			return newBase;
		}

		/**
		 * The stuff() method uses other methods to sum the results of mathematical operations performed upon three double values.
		 * @param a A double value
		 * @param b A double value
		 * @param d A double value
		 * @return The square root of a plus the absolute value of b plus d raised to the b power.
		 */

		public static double stuff(double a, double b, double d) {
			return squirt(a) + abs(b) + power(d, b);
		}

		/**
		 * The main() method is the entry point of the application and utilizes the methods created in class MethodMan to perform operations upon user-entered doubles and then displays the results.
		 * @param args arguments passed from the command line
		 */

		public static void main(String[] args) {
			//Prompt user to enter a number
			System.out.println("enter a number");
			//create a scanner object
			Scanner keyboard = new Scanner(System.in);
			//read user entry
			double entry = keyboard.nextDouble();
			//use powerTen() method
			System.out.println("The tenth power is " + powerTen(entry));
			//prompt for two more numbers
			System.out.println("now enter two numbers and i will add them");
			//read entries
			double summy = keyboard.nextDouble();
			double summy1 = keyboard.nextDouble();
			//use addTwo() method
			double sumSum = addTwo(summy, summy1);
			System.out.println("the sum of your numbers is " + sumSum);
			//use abs() method
			System.out.println("the absolute value of your sum is " + abs(sumSum));
			//use squirt() method
			System.out.println("the square root of your sum is " + squirt(abs(sumSum)));
			//use the power() method
			System.out.println("if the first number entered is the base, and the second the exponent, then the resut is " + power(abs(entry), abs(summy)));
			//prompt user for three more numbers
			System.out.println("now enter three numbers, i will find the root of the first, the absolute value of the second, and the sum of the third number to the second power.");
			//read numbers
			double q = keyboard.nextDouble();
			double r = keyboard.nextDouble();
			double s = keyboard.nextDouble();
			//use stuff() method
			System.out.println("The result is " + stuff(q, r, s));
		}

		
	
}
