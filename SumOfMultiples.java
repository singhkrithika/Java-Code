/**
 * SumOfMultiples.java
 * Finds all of the numbers that are
 * multiples of 3 or 5 and adds them.
 * These numbers must be less than 6000.
 * @author Krithika Singh
 * @version 1.0
 * @since 8/30/2021
 */

public class SumOfMultiples
{
	/** Runs an instance of SumOfMultiples */
	public static void main(String [] args)
	{
		SumOfMultiples run = new SumOfMultiples();
		run.LessThan6000();

	}
	/** Finds all numbers that are less than
	 * 6000 (not inclusive) and checks to see
	 * if they are multiples of 3 or 5. If
	 * they are, adds them together.
	 */
	public void LessThan6000 ( )
	{
		int sum = 0;
		for (int i = 0; i < 6000; i++)
		{

			if (i % 3 == 0 || i % 5 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
