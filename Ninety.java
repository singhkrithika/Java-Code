/** 
 * Ninety.java
 * For all of the numbers less than 90 
 * (inclusive), find the squares of all
 * of them and then sum it. Also, find 
 * the sum of all of the numbers less
 * than 90, and then square that. Then,
 * find the difference between the sums.
 * @author Krithika Singh
 * @version 1.0
 * @since 8/30/2021
 */

public class Ninety 
{
	long sumFirst = 0;
	long squareFirst = 0;
	/** Runs an instance of Ninety */
	public static void main (String [] args)
	{
		Ninety run = new Ninety();
		run.sumThenSquare();
		run.squareThenSum();
		run.difference();
	}
	
	/** Finds the sum of all of the 
	 * numbers below 90. Then squares
	 * that sum. 
	 */
	public long sumThenSquare ()
	{
		sumFirst = 0;
		for (int i = 0; i <= 90; i++)
		{
			sumFirst += i;
		}
		sumFirst *= sumFirst;
		return sumFirst;
	}
	
	/** Finds the squares of all of the
	 * numbers below 90. Then adds all 
	 * of those numbers together.
	 */
	public long squareThenSum ()
	{
		squareFirst = 0;
		for (int i = 0; i <= 90; i++)
		{
			squareFirst += (i * i);
		}
		return squareFirst;
	}
	public long difference()
	{
		System.out.println("Difference: " + (sumFirst - squareFirst));
		return sumFirst - squareFirst;
	}
}