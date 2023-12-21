/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int c = Integer.parseInt (args[0]);
		int d = Integer.parseInt (args[1]);
		int a = Integer.parseInt (args[2]);
		int b = Integer.parseInt (args[3]);

		System.out.println(c + " + " + d + " = " + (c + d));
		System.out.println(a + " + " + b + " = " + (a + b));

	}
}
