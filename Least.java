/**
 * Least.java
 * Finds the smallest positive number
 * that is divisible by all of the
 * numbers from 1 to 25.
 * @author Krithika Singh
 * @version 1.0
 * @since 8/30/2021
 */

public class Least
{
	/** Runs an instance of Least */
	public static void main(String [] args)
	{
		Least run = new Least();
		run.from1to25();
	}
	/** Finds the smallest positive number
	* that is divisible by all of the
	* numbers from 1 to 25 by multiplying
	 * 25 with an incremented number
	 * until that multiplied number is
	 * divisible by all numbers up to 25.
	*/

	public long from1to25 ()
	{
		long ans = 25;
		long result = 0;
		boolean found = true;
		for (long i = 2; i < Long.MAX_VALUE; i++ )
		{
			found = true;
			for (int m = 2; m <= ans; m++)
			{
				if ((ans * i) % m != 0)
				{
					found = false;
					break;
				}
			}
			if (found == true)
			{
				result = ans * i;
				break;
			}

		}
		System.out.println("Answer: " + result);
		return result;
	}
}
