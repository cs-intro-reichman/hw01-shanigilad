/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// put your code here
		int num = Integer.parseInt (args[0]); //change the args to numbers 
		int numq = (num / 25); // number of coins that can be represented in quarters
		int numc = (num % 25); // number of coins that can not be represented in quarters
			System.out.println ("use " + numq + " quarters and " +  numc  + " cents");
	}
}