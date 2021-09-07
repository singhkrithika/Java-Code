/**
 * ThousandSum.java
 * Finds a pythagorean triple such
 * that when a, b, and c are added
 * together, they equal 1000. There
 * is only one pythagorean triple.
 * @author Krithika Singh
 * @version 1.0
 * @since 8/30/2021
 */

public class ThousandSum
{
	/** Runs findPythagorean. */
	public static void main(String args[])
	{
		ThousandSum run = new ThousandSum();
		run.findPythagorean();
	}

	/** Finds all of the Pythagorean
	 * triplets under a 1000. In general,
	 * a = d^2 - e^2, b = 2de, and
	 * c = d^2 + e^2. This is known
	 * formula. I applied this in the
	 * form of java code.
	 */
	public void findPythagorean ()
	{
		int a, b, c = 1;
		int d = 1;
		while (c < 700) {
			for (int e = 1; e < d; e++) {
				a = (d*d) - (e*e);
				b = 2*d*e;
				c = (d*d) + (e*e);

				if (a+b+c == 1000) {
					System.out.println(a*b*c);
				}
			}
			d++;
		}
	}
}