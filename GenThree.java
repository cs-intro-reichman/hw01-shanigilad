/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int Min = Integer.parseInt (args[0]);	
		int Max = Integer.parseInt (args[1]);	
		double rand = Math.random (); // 0-1 
		int random1 = (int)(Math.random() * (Max - Min) + Min);
		int random2 = (int)(Math.random() * (Max - Min) + Min);
		int random3 = (int)(Math.random() * (Max - Min) + Min);
			System.out.println(random1);
			System.out.println(random2);
			System.out.println(random3);

		if ((random1 < random2) && (random1 < random3)) {
			System.out.println("The minimal generated number was " + random1);
		} else if ((random2 < random1) && (random2 < random3)) {
			System.out.println("The minimal generated number was " + random2);
		} else {
			System.out.println("The minimal generated number was " + random3);
		}
	}
}
