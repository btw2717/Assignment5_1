import java.util.Scanner;

/**
 * The class MethodMan2 contains a main method which performs a variety of operations upon two user-entered numbers utilizing methods for the Math class.
 * @author sapper
 * email: email
 * @version 1.0
 * Created 12NOV2017
 */

public class MethodMan2 {

	/**
	 * The main() method is a void method and so it performs some action other than returning a value, in this case it carries out numerous operations upon two user-entered double values.
	 * @param args arguments passed from the command line
	 */

	public static void main(String[] args) {
		//Prompt for numbers
		System.out.println("Enter two numbers and I will perform a variety of operations upon them");
		//create scanner object
		Scanner keyboard = new Scanner(System.in);
		//read entries
		double entry1 = keyboard.nextDouble();
		double entry2 = keyboard.nextDouble();
		//use Math.pow
		System.out.println("the first number raised to the power of the second is: " + Math.pow(entry1, entry2));
		//square root
		System.out.println("The square root of the first number is: " + Math.sqrt(entry1));
		//absolute value
		System.out.println("The absolute value of the second number is: " + Math.abs(entry2));
		//Random
		System.out.println("Now I will produce a product of the first number and a random number: " + entry1 * Math.random());
		//Greater number
		System.out.println("The greater of your two numbers is: " + Math.max(entry1, entry2));
		//Lesser number
		System.out.println("The lesser of your two numbers is: " + Math.min(entry1, entry2));
		//Rounding a product
		System.out.println("The rounded product of your two numbers is: " + Math.round(entry1 * entry2));
		//Rounding a quotient up
		System.out.println("Now I will divide your entries, and round the quotient up: " + Math.ceil(entry1 / entry2));
		//Rounding a quotient down
		System.out.println("Now I will round the quotient of the first entry by the second entry down: " + Math.floor(entry1 / entry2));
	}
}
